import java.util.Scanner;
public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println("Enter the bit position to set:");
        int i = sc.nextInt();

        // Set the ith bit
        int result = number | (1 << i);

        System.out.println("Number after setting the " + i + "th bit: " + result);
    }
}
