public class Overflow {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = 1;
        int c = a + b; // This will cause an overflow
        System.out.println("Overflow result: " + c);
    }
}
