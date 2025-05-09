import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits =0;
        int temp = num;
        while(temp!=0){
            temp = temp / 10;
            digits++;
        }

        while (num != 0) {
            int r = num % 10;
            num = num / 10;
            sum += Math.pow(r, digits);
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
