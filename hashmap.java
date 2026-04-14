import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Map<Integer, Integer> body = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            body.put(arr[i], i);
        }
        System.out.println(body.containsValue(3));
    }
}
