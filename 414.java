package com;


/**
 * Created by wWX945273 on 2020/12/21.
 */
public class Solution414 {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i=0; i<nums.length; i++){
            if (nums[i]>first) {
                third = second;
                second = first;
                first = nums[i];
            }else if (nums[i] == first){
                continue;
            }else if (nums[i]>second && nums[i]<first){
                third = second;
                second = nums[i];
            }else if (nums[i]==second){
                continue;
            }else if (nums[i]>third){
                third = nums[i];
            }
        }
        return (int)(third==Long.MIN_VALUE? first: third);
    }
}
