package com;

/**
 * Created by wWX945273 on 2020/12/10.
 */
public class Solution213 {
    public int rob(int[] nums) {
        int N = nums.length;
        if(N == 1) return nums[0];
        if(N == 2) return Math.max(nums[0], nums[1]);

        //第一个房子和最后一个房子不能同时在一块
        //f[i]:偷到第i个房子所能偷到最多的钱

        //偷第一个房子，那么就相当于只有0~N-2共N-1个房子
        int[] f1 = new int[nums.length-1];
        f1[0] = nums[0];
        f1[1] = Math.max(nums[0], nums[1]);
        for (int i=2; i<N-1; i++){
            f1[i] = Math.max(nums[i]+f1[i-2], f1[i-1]);
        }

        //不偷第一个房子，那么就相当于只有1~N-1共N-1个房子
        int[] f2 = new int[nums.length];
        f2[0] = 0;
        f2[1] = nums[1];
        for (int i=2; i<N; i++){
            f2[i] = Math.max(nums[i]+f2[i-2], f2[i-1]);
        }

        return Math.max(f1[f1.length-1], f2[f2.length-1]);
    }
}
