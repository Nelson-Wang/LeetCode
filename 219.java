package com;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums==null || nums.length==0) return false;
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[j]==nums[i] && j-i<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
