import java.util.Scanner;

public class Hoteltarrif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        double rentPerDay = sc.nextDouble();
        int days = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
        } else {

            if (month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {
                rentPerDay *= 1.2;
            }
            double total = rentPerDay * days;
            System.out.printf("%.2f\n", total);
        }

        sc.close();
    }
}
