package com;

/**
 * Created by wWX945273 on 2021/2/25.
 */
public class Solution611 {
    public int triangleNumber(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++){
            for (int j = i + 1; j < n -1; j++){
                for (int k = j + 1; k < n; k++){
                    if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j] && nums[j] + nums[k] > nums[i]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
