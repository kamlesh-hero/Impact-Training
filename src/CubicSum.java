import java.util.*;

public class CubicSum {
    public static void main(String[] args){
        int[] arr = {1458, 370, 28, 2, 8};
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            int x = 1;
            int y = (int) Math.cbrt(arr[i]);
            boolean found = false;

            while(x <= y){
                int z = x * x * x + y * y * y;  // fix: x^3 is not power in Java
                if(z == arr[i]){
                    count++;
                    found = true;
                    break;
                } else if(z < arr[i]){
                    x++;
                } else {
                    y--;
                }
            }
        }

        System.out.println(count);
    }
}
