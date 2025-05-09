import java.util.*;
public class ifElse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        if(num>=10 && num <100){
            if (num/2==0 && num<20 ){

                System.out.println("Even number and less than 20");

            } else if (num/2==0 && num>20) {
                System.out.println("Even number and greater than 20");
            }
            else if(num/2!=0 && num<20){
                System.out.println("odd number  and less than 20");
            }
            else{
                System.out.println("odd number  and greater than 20");
            }
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
