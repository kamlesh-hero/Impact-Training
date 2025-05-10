import java.util.Scanner;

public class ArrayInsertion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Input the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the value before which the new element should be inserted
        System.out.println("Enter the value  which to insert:");
        int value = sc.nextInt();
        System.out.println("Enter the new element to insert:");
        int newElement = sc.nextInt();

        // Find the position of the value
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                position = i; // insert before this index
                break;
            }
        }

        if (position == -1) {
            System.out.println("Value not found in array.");
            return;
        }

        // Create new array with extra space
        int[] newArr = new int[size + 1];

        // Copy and insert
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = newElement;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        // Print the new array
        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
