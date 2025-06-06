import java.util.HashMap;
public class FindDuplicates {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }


        for(Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
//
    }
}
