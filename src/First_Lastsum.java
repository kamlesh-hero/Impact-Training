import java.util.*;
public class First_Lastsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-digit number:");
        int number = sc.nextInt();

        int firstDigit = number / 1000;
        int lastDigit = number % 10;

        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digit: " + sum);
    }
}
