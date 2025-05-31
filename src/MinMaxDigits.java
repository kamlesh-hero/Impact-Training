public class MinMaxDigits {

    static void findMinMaxDigits(int number) {
        int min = 9;
        int max = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit < min) min = digit;
            if (digit > max) max = digit;
            number /= 10;
        }

        System.out.println("Minimum digit: " + min);
        System.out.println("Maximum digit: " + max);
    }

    public static void main(String[] args) {
        findMinMaxDigits(276);
    }
}
