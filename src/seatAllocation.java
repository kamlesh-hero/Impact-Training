import java.util.Scanner;

public class seatAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int row = scanner.nextInt();

        System.out.print("Enter column: ");
        int column = scanner.nextInt();

        System.out.print("Enter seat number: ");
        int seat = scanner.nextInt();

        if (seat <= column || seat % column == 0 || seat % column == row + 1) {
            System.out.println("CSE");
        } else {
            System.out.println("ECE");
        }

        scanner.close();
    }
}
