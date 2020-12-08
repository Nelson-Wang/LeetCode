package com;

/**
 * Created by wWX945273 on 2020/12/7.
 */
public class Solution152 {
    public int maxProduct(int[] nums) {
        int[] f1 = new int[nums.length];
        int[] f2 = new int[nums.length];
        //f1最大值，f2为最小值
        f1[0] = nums[0];
        f2[0] = nums[0];

        for (int i=1; i<nums.length; i++){
            if (nums[i]<0){
                f1[i] = Math.max((f2[i]-1)*nums[i], nums[i]);
                f2[i] = Math.min((f1[i]-1)*nums[i], nums[i]);
            }else {
                f1[i] = Math.max((f1[i]-1)*nums[i], nums[i]);
                f2[i] = Math.min((f2[i]-1)*nums[i], nums[i]);
            }
        }
        int max = f1[0];
        for (int k=1; k<f1.length; k++){
            if (f1[k]>max) max = f1[k];
        }
        return max;
    }
}
