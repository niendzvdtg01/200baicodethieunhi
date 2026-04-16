import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> body = RomanStandard();
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (body.get(s.charAt(i)) >= body.get(s.charAt(i + 1))) {
                sum += body.get(s.charAt(i));
            } else {
                sum -= body.get(s.charAt(i));
            }
        }
        sum += body.get(s.charAt(s.length() - 1));
        return sum;
    }

    public static Map<Character, Integer> RomanStandard() {
        Map<Character, Integer> body = new HashMap<>();
        body.put('I', 1);
        body.put('V', 5);
        body.put('X', 10);
        body.put('L', 50);
        body.put('C', 100);
        body.put('D', 500);
        body.put('M', 1000);
        return body;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
