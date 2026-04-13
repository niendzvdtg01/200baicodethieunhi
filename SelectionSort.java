import java.util.Arrays;

public class SelectionSort {
    public static int[] Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[] = { 12, 12, 31, 2, 1, 2, 31, 21 };
        System.out.println(Arrays.toString(Sort(a)));
    }
}