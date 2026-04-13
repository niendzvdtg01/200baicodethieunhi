import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstring {
    public static String longestPalindrome(String s) {
        List<Character> subString = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            subString.add(s.charAt(i));
        }
        var a = subString.toArray();
        System.out.println(a[0]);
        return s;
    }

    public static void main(String[] args) {
        longestPalindrome("Dcmm");
    }
}
