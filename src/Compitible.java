import java.util.Scanner;

public class Compitible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of arrays
        System.out.println("Enter the size of the arrays:");
        int size = sc.nextInt();

        // Input first array
        int[] arr1 = new int[size];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        int[] arr2 = new int[size];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        // Check compatibility
        boolean isCompatible = true;
        for (int i = 0; i < size; i++) {
            if (arr1[i] < arr2[i]) {
                isCompatible = false;
                break;
            }
        }

        // Output result
        if (isCompatible) {
            System.out.println("The arrays are compatible.");
        } else {
            System.out.println("The arrays are not compatible.");
        }
    }
}