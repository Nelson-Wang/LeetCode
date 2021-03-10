package contest;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by wWX945273 on 2021/3/10.
 */
public class Solution1748 {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        Set<Integer> keySet = map.keySet();
        for (Integer key: keySet){
            if (map.get(key) == 1){
                sum += key;
            }
        }
        return sum;
    }
}
