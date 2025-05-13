import java.util.Scanner;

public class EvenOddSegregation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n]; // To store segregated result
        int index = 0;

        // Read input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // First add even numbers to result[]
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Then add odd numbers to result[]
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        // Print result
        System.out.println("Array after Segregation");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
