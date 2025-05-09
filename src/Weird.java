import java.util.*;

public class Weird {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0){
            if(num>=2 && num<=5){
                System.out.println("Not Weired");
            }
            else if (num>=6 && num<=20) {
                System.out.println("Weired");
            }
            else{
                System.out.println("Not Weired");

            }
        }
        else {
            System.out.println("Weired");
        }
    }
}
