import java.util.Scanner;
public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        for(int i=m;i<=n;i++){
            int num=i;
            int firstDigit=num/10;
            int lastDigit=num%10;
            int sum=firstDigit+lastDigit;

            int product=firstDigit*lastDigit;
            if(sum+product==num){
                System.out.println(num);
            }

        }

    }
}
