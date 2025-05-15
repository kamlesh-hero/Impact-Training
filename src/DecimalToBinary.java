public class DecimalToBinary {



    public static int decimalToBinary(int decimal) {
        int rev = 0;
        int place = 1;

        while (decimal > 0) {
            int remainder = decimal % 2;
            rev += remainder * place;
            place *= 10;
            decimal /= 2;
        }

        return rev;
    }

    public static void main(String[] args) {


        int decimalInput = 13;
        int binaryResult = decimalToBinary(decimalInput);
        System.out.println("Decimal to Binary: " + binaryResult);
    }
}
