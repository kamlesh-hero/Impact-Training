public class AdamNumber {

    // Function to reverse a number
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // Function to check if a number is an Adam Number
    static boolean isAdamNumber(int num) {
        int square = num * num;
        int reversedNum = reverse(num);
        int reversedSquare = reversedNum * reversedNum;
        return square == reverse(reversedSquare);
    }

    // Main method
    public static void main(String[] args) {
        int num = 12;  // You can change this to test other numbers
        if (isAdamNumber(num)) {
            System.out.println(num + " is an Adam Number.");
        } else {
            System.out.println(num + " is not an Adam Number.");
        }
    }
}
