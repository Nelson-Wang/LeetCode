package com;

/**
 * Created by wWX945273 on 2020/12/24.
 * 704. Binary Search
 */
public class Solution704 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] >target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
