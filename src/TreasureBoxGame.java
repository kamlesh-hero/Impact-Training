import java.util.Scanner;

public class TreasureBoxGame {

    // Function to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three integers (box numbers)
        int box1 = scanner.nextInt();
        int box2 = scanner.nextInt();
        int box3 = scanner.nextInt();

        // Find the second largest number
        int secondLargest = Math.max(Math.min(box1, box2), Math.min(Math.max(box1, box2), box3));

        // Calculate the GCD of the three numbers
        int code = gcd(gcd(box1, box2), box3);

        // Output the result
        System.out.println("The treasure is in the box which has the number " + secondLargest);
        System.out.println("The code to open the box " + code);

        scanner.close();
    }
}
