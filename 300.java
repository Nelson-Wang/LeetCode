package com;

/**
 * Created by wWX945273 on 2020/12/11.
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        //f[j]:以a[j]结尾的最长子序列的长度(j为在子序列中的索引)
        int n = nums.length;
        int[] f = new int[n];


        for (int i=0; i<n; i++){
            f[i] = 1;
            for (int j=0; j<i; j++){
                if (nums[j]<nums[i]){
                    f[i] = Math.max(f[i], f[j]+1);
                }
            }
        }
        int max = f[0];
        for (int i=1; i<n; i++){
            if (f[i]>max) max = f[i];
        }
        return max;
    }
}
