import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int[] map= {2,2,1,1,1,2,2};
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for(int i=0;i<map.length;i++){
            int num = map[i];
            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        for(Integer key : countMap.keySet()) {
            if(countMap.get(key) > map.length / 2) {
                System.out.println("Majority Element: " + key);
                return;
            }
        }
    }
}
