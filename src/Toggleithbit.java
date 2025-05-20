import java.util.Scanner;
public class Toggleithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println("Enter the bit position to toggle:");
        int i = sc.nextInt();

        // Toggle the ith bit
        int result = number ^ (1 << i);

        System.out.println("Number after toggling the " + i + "th bit: " + result);
    }
}
