public class SecondLargest {

    static int findSecondLargest(int[] arr) {
        java.util.Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 9};
        int result = findSecondLargest(arr);
        System.out.println("Second largest number: " + result);
    }
}
