import java.util.Scanner;

public class ArrayLenngth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size for first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        int sum1 = 0;
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
            sum1 += arr1[i];
        }

        // Input size for second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        int sum2 = 0;
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
        }

        // Compare sums
        if (sum1 == sum2) {
            System.out.println("Arrays are the same (sum is equal).");
        } else {
            System.out.println("Arrays are different (sum is not equal).");
        }

        sc.close();
    }
}
