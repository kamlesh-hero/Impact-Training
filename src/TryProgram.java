import java.util.*;

public class TryProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        String numstr = Integer.toString(number);
        char firstDigitChar = numstr.charAt(0);
        char lastDigitChar = numstr.charAt(numstr.length() - 1);

        int firstDigit = Character.getNumericValue(firstDigitChar);
        int lastDigit = Character.getNumericValue(lastDigitChar);

        int total = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit: " + total);
    }
}
