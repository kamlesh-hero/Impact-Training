import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Two-pointer logic
        int left = 0, right = n - 1;

        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                // Swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // Print output
        System.out.println("Array after Segregation");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
