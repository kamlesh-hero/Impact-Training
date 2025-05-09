import java.util.Scanner;
public class SubOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int diff = 0;
        for (int i = 0; i < size; i++) {
          if(i==0){
            diff=arr[i];
          }
          else{
            diff -= arr[i];
          }

        }
        System.out.println("Subtraction of array elements: " + diff);
    }
}
