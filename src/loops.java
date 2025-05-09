import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();


        while(n!=1){
            if(n%2==0){
                n=n/2;
                System.out.println(n);
            }
            else{
                System.out.println(3*n+1);

            }

        }
    }
}
