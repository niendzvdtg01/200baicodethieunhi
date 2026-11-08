/**
 * TypeCasting
 */
public class TypeCasting {
    public static void main(String[] args) {
        // 1. widening
        int count = 50;
        double price = count;
        System.out.println("widening casting: " + price);
        // 2. Test narrowing
        double rawScore = 0.99;
        int truncated = (int) rawScore;
        int rounded = (int) Math.round(rawScore);
        System.out.println(truncated + " and " + rounded);
        // 3. Narrowing fail-fast
        long userCount = 5_000_000_000L;
        try {
            int safeCount = Math.toIntExact(userCount);
        } catch (ArithmeticException ex) {
            System.out.println("Bat tran so an toan voi Math.toIntExact");
        }

        // 4. Pattern matching instanceof an toan
        Object data = "OLHub Platform 2026";
        if (data instanceof String str && !str.isEmpty()) {
            System.out.println("Noi dung hop le: " + str.toUpperCase());
        }
    }

}