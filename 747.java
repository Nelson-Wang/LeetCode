package com;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution747 {
    public int dominantIndex(int[] nums) {
        if (nums.length==1) return 0;
        int first = -1, second = -1;
        int i = -1;
        for(int k=0; k<nums.length; k++){
            if (nums[k]>=first){
                second = first;
                first = nums[k];
                i = k;
            }else if (nums[k]>=second){
                second = nums[k];
            }
        }
        return first>=2*second? i: -1;
    }
}
