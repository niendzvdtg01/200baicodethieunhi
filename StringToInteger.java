import java.util.*;

public class StringToInteger {
    public static int myAtoi(String s) {
        int nums = Integer.parseInt(s);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("1337c0d3"));
    }
}
