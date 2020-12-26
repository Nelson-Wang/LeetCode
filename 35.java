package com;

/**
 * Created by wWX945273 on 2020/12/24.
 */
public class Solution35_2 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}