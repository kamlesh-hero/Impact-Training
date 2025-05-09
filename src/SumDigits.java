import java.util.Scanner;
 public class SumDigits {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number:");
         int num = sc.nextInt();
         int sum = 0;
         int total_sum=0;
         while (num != 0) {
             int r = num % 10;
             num = num / 10;
             sum += r;
             if(sum>=10){
                 int r1=sum%10;
                 int r2=sum/10;
                 total_sum=r1+r2;
             }


         }


         System.out.println("Sum of digits: " +total_sum);
     }
}
