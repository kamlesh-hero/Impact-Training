import java.util.Scanner;

public class MaxHeightAndWidth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        int n = sc.nextInt();
        int[] data = new int[n * 2];

        // Input heights and weights
        for (int i = 0; i < n * 2; i++) {
            data[i] = sc.nextInt();
        }

        int maxHeight = data[0];
        int maxWeight = data[1];
        int maxHeightPerson = 1;
        int maxWeightPerson = 1;

        for (int i = 1; i < n; i++) {
            int height = data[2 * i];
            int weight = data[2 * i + 1];

            if (height > maxHeight) {
                maxHeight = height;
                maxHeightPerson = i + 1;
            }

            if (weight > maxWeight) {
                maxWeight = weight;
                maxWeightPerson = i + 1;
            }
        }

        // Output person numbers with max height and weight
        System.out.println(maxHeightPerson + " " + maxWeightPerson);
    }
}
