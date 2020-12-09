package com;

/**
 * Created by wWX945273 on 2020/12/9.
 */
public class Solution697 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length==0) return 0;
        //f[j]:以nums[j]结尾的最长连续上升子序列的长度
        int[] f = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            f[i] = 1;
            if (i>=1 && nums[i]>nums[i-1]){
                f[i] = f[i-1] + 1;
            }
        }
        int max = f[0];
        for (int j=1; j<f.length; j++){
            if (f[j]>max) max =f[j];
        }
        return max;
    }
}
