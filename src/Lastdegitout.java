import java.util.Scanner;
public class Lastdegitout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int squre = num * num;
//        System.out.println("Square of the number: " + squre);


        int reversed = 0;
       while(num!=0) {
           int r = num % 10;
           reversed = reversed * 10 + r;
           num = num / 10;
       }
//        System.out.println(reversed);


       int reversedno=0;
       int reversedsqure=reversed*reversed;
//        System.out.println("Square of the reversed number: " + reversedsqure);
       while(reversedsqure!=0){
           int r1=reversedsqure%10;
           reversedno=reversedno*10+r1;
           reversedsqure=reversedsqure/10;
       }
//        System.out.println(reversedno);
       if(squre==reversedno){
           System.out.println("Addam Number");
       }
       else{
           System.out.println("No");
       }

    }
}
