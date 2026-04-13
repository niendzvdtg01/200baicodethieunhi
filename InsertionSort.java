import java.util.Arrays;

public class InsertionSort {
    public static int[] Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int insertValue = i;
            int currentValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                insertValue = j;
                j--;
            }
            arr[insertValue] = currentValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 1, 2, 3, 4, 1 };
        System.out.println(Arrays.toString(Sort(a)));
    }
}
