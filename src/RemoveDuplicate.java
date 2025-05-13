import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int newSize = 0;

        // Store first element
        temp[newSize++] = arr[0];

        // Compare each element with the previous one
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[newSize++] = arr[i];
            }
        }

        // Print result
        System.out.println("Sorted array without duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }

        scanner.close();
    }
}
