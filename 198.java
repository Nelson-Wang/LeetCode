package com;

/**
 * Created by wWX945273 on 2020/12/4.
 */
public class Solution198 {
    public int rob(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        int[] money = new int[nums.length];
        money[0] = nums[0];
        money[1] = Math.max(nums[0], nums[1]);
        for (int i=2; i<nums.length; i++){
            money[i] = Math.max(money[i-1], money[i-2]+nums[i]);
        }
        return money[money.length-1];
    }
}
