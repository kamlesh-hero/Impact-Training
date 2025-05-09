import java.util.Scanner;
public class TrendyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num>=100 && num<1000){
            int midDigit=(num/10)%10;

            if(midDigit%3==0){
                System.out.println("Trendy number");
            }
            else{
                System.out.println("Not a trendy number");
            }
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
