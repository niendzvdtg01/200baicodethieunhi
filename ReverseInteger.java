public class ReverseInteger {

    public static int Solution(int nums) {
        int len = (Integer.toString(Math.abs(nums))).length();
        int reverse = 0;
        for (int i = 0; i < len; i++) {
            reverse += ((nums / (int) Math.pow(10, i)) % 10) * (int) Math.pow(10, len - 1 - i);
        }
        if (reverse > Integer.MAX_VALUE)
            return 0;
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(Solution(123));
    }
}
