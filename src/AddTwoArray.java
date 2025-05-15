import java.util.Arrays;

public class AddTwoArray {

    public static int[] addTwoNumbers(int[] l1, int[] l2) {
        int maxLength = Math.max(l1.length, l2.length);
        int[] result = new int[maxLength + 1]; // +1 for possible carry
        int carry = 0;

        for (int i = 0; i < result.length; i++) {
            int a = (i < l1.length) ? l1[i] : 0;
            int b = (i < l2.length) ? l2[i] : 0;

            int sum = a + b + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        // Remove leading zero if no carry occurred in the last position
        if (result[result.length - 1] == 0) {
            return Arrays.copyOf(result, result.length - 1);
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        int[] l1 = {2, 3, 5};  // represents 342
        int[] l2 = {5, 2, 5};  // represents 465

        int[] result = addTwoNumbers(l1, l2);  // should represent 807 -> [7, 0, 8]

        System.out.print("Result: ");
        printArray(result);
    }
}
