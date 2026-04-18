import java.util.*;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        List<Character> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int increment = 2 * (numRows - 1);
            for (int j = i; j < s.length(); j += increment) {
                res.add(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j + increment - 2 * i < s.length()) {
                    res.add(s.charAt(j + increment - 2 * i));
                }
            }
        }
        String result = res.stream()
                .map(String::valueOf)
                .collect(java.util.stream.Collectors.joining());
        return result;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }
}
