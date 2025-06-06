import java.util.HashMap;
import java.util.Scanner;
public class FrequncyOfVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            }
        }


        System.out.println(map);
    }
}
