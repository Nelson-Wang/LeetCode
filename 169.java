package com;

import java.util.HashMap;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i])+1);
            }
            if (map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
