public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "vammvbe";
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}
