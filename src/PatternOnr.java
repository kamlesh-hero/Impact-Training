import java.util.Scanner;
public class PatternOnr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

//        for(int i=1;i>=num;i--){
//            for(int j=i;j<=num;j++){
//                System.out.print("  ");
//            }
//            for(int j=i;j<=num;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for(int i=0;i<=num;i++){
            for(int j=0;j<=num;j++){
                if(i==0 || i==num){
                    System.out.print("* ");
                }
                else if(j==0 || j==num){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
