//facorial using recursion
public class Factorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int number = 5; // Example input
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
