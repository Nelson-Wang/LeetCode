package com;

/**
 * Created by wWX945273 on 2020/12/29.
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        boolean[] tmp = new boolean[nums.length + 1];
        for (int i = 0; i< nums.length; i++){
            tmp[nums[i]] = true;
        }
        for (int j = 0; j < tmp.length; j++){
            if (!tmp[j]){
                return j;
            }
        }
        return -1;
    }
}
