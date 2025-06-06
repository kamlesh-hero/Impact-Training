import java.util.*;

public class CountVowel {
    public static void main(String[] args) {
        HashMap<Character, Integer> vowelCount = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();



        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                if (vowelCount.containsKey(ch)) {
                    vowelCount.put(ch, vowelCount.get(ch) + 1);
                } else {
                    vowelCount.put(ch, 1);
                }
            }
        }

        System.out.println(vowelCount);
    }
}
