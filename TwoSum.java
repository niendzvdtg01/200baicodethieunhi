import java.util.*;

public class TwoSum {
    public static List<Integer> Solution(int[] arr, int target) {
        Map<Integer, Integer> numsIndex = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];
            if (numsIndex.containsKey(compliment)) {
                return Arrays.asList(numsIndex.get(compliment), i);
            }
            numsIndex.put(arr[i], i);
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Solution(arr, 9));
    }
}