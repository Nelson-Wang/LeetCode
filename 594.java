package com;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by wWX945273 on 2020/12/18.
 * 594. Longest Harmonious Subsequence
 */
public class Solution594 {
    public int findLHS(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        int max = 0;
        Set<Integer> keys = map.keySet();
        for (int key: keys){
            if (!map.containsKey(key+1)) continue;
            int tmp = map.get(key) + map.get(key+1);
            max = Math.max(tmp, max);
        }
        return max;
    }
}
