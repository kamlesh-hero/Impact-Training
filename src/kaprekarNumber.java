import java.util.Scanner;
public class kaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int square = num * num;
        int count = 0;
        int temp = square;

        while (temp != 0) {

            count++;
            temp /= 10;
        }

        int sum = 0;
        int divisor = (int) Math.pow(10, count / 2);
        sum = square / divisor + square % divisor;

        if (sum == num) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
    }
}
