import java.util.*;
public class ReverceNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number:");
        int num= sc.nextInt();

        int hen=num/100;
        int ten=(num/10)%10;
        int one=num%10;

        int reverse=(one*100)+(ten*10)+hen;
        System.out.println("Reverse of the number is: "+reverse);

    }
}
