public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        return s;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nums[j][i]);
            }
        }
        // System.out.println();
    }
}
