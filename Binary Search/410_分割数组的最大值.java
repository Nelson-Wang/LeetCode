package typeMoudle.binarySearch;

/**
 * Created by wWX945273 on 2020/8/19.
 */

import java.util.Arrays;

/**
 410. Split Array Largest Sum 分割数组的最大值

 Given an array which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.

 Write an algorithm to minimize the largest sum among these m subarrays.

 Note:
 Given m satisfies the following constraint: 1 ≤ m ≤ length(nums) ≤ 14,000.

 Examples:

 Input:
 nums = [7,2,5,10,8]
 m = 2

 Output:
 18

 Explanation:
 There are four ways to split nums into two subarrays.The best way is to split it into [7,2,5] and [10,8],where the largest sum among the two subarrays is only 18.
 */
public class 分割数组的最大值_410 {
    public static int splitArray(int[] nums, int m) {
        int left = 0, right = 0;
        //left初始值为数组的最大值
        for (int i=0; i<nums.length; i++){
            if (nums[i] > left){
                left = nums[i];
            }
        }
        //right的初始值为数组的和
        for (int j=0; j<nums.length; j++){
            right += nums[j];
        }
        while (left < right){
            int mid = left + (right-left)/2;
            if (canSplit(nums, m, mid)){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean canSplit(int[] nums, int m, int sum){
        int cnt = 1, curSum = 0;
        for (int i=0; i<nums.length; i++){
            curSum += nums[i];
            if (curSum > sum){
                curSum = nums[i];
                cnt++;
                if (cnt > m){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int m = 3;
        System.out.println(splitArray(nums, m));
    }
}
