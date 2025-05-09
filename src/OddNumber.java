import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= num; i++) {
            int temp = i; // Use a temporary variable to avoid modifying `i`
            int digit_count = 0;

            while (temp != 0) {
                temp /= 10;
                digit_count++;
            }

            if (digit_count % 2 != 0) {
                count++;
            }
        }

        System.out.println("Count of numbers with an odd number of digits: " + count);
    }
}