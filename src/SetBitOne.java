public class SetBitOne {
    public static void main(String[] args) {
        int number = 23; // binary: 101010
        int i = 2;

        int[] binary = new int[32];
        int index = 0;

        int temp = number;

        // Convert to binary (store in reverse)
        while (temp > 0) {
            binary[index++] = temp % 2;
            temp = temp / 2;
        }

        // Check the i-th bit
        if (i < index) {
            if (binary[i] == 1) {
                System.out.println("Bit " + i + " is set (1).");
            } else {
                System.out.println("Bit " + i + " is not set (0).");
            }
        } else {
            System.out.println("Bit " + i + " is not set (0).");
        }
    }
}
