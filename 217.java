package com;

import java.util.HashMap;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums==null || nums.length==0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                return true;
            }
        }
        return false;
    }
}
