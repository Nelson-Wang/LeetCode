package com;

/**
 * Created by wWX945273 on 2020/12/7.
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        boolean[] f = new boolean[nums.length];
        //初始化
        f[0] = true;
        for (int j=1; j<nums.length; j++){
            f[j] = false;
            // 找到i到j可以跳到的一种情况即可（可以调到f[i]且i+nums[i]>=j）
            for (int i=0; i<j; i++){
                if (f[i] && i+nums[i]>=j){
                    f[j] = true;
                    break;
                }
            }
        }
        return f[nums.length-1];
    }
}
