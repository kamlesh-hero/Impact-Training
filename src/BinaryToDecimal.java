public class BinaryToDecimal {
    public static int binaryToDecimal(int n) {
        int decimal = 0;
        int base = 1;

        while (n > 0) {
            int lastDigit = n% 10;
            decimal += lastDigit * base;
            base *= 2;
            n /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {

        int binary = 1011;
        int decimal = binaryToDecimal(binary);
        System.out.println("Binary to Decimal: " + decimal);
    }
}
