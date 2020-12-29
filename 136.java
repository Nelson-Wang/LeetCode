package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wWX945273 on 2020/12/29.
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], 2);
            }
        }
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (map.get(next) == 1){
                return next;
            }
        }
        return -1;
    }
}
