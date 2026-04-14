import java.util.*;

public class string {
    static String random = "abcdefgh";

    public static void main(String[] args) {
        List<Character> a = new ArrayList<>();
        for (char i : random.toCharArray()) {
            a.add(i);
        }
        System.out.println(a);
    }
}