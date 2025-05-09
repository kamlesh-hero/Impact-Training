import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        // Sort the array in ascending order
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
