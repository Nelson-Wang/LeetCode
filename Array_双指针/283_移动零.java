package module.双指针;

/**
 * Created by wWX945273 on 2020/8/18.
 */

import java.util.Arrays;

/**
 283. Move Zeroes 移动零
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:

 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 */

/**
 思路：使用双指针的同向法，使用两个指针，一个不停的向后扫，找到非零位置，然后和前面那个指针交换位置即可
 */
public class 移动零_283 {
    public static void moveZeroes(int[] nums){
        int i = 0;
        int j = 0;
        while (j < nums.length){
            if(nums[j] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }



}
