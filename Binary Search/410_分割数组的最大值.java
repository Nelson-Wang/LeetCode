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

/**
 思路：首先来分析，如果m和数组 nums 的个数相等，那么每个数组都是一个子数组，所以返回 nums 中最大的数字即可，如果m为1，那么整个 nums 数组就是一个子数组，返回
 nums 所有数字之和，所以对于其他有效的m值，返回的值必定在上面两个值之间，所以可以用二分搜索法来做。用一个例子来分析，nums = [1, 2, 3, 4, 5], m = 3，将 left
 设为数组中的最大值5，right 设为数字之和 15，然后算出中间数为 10，接下来要做的是找出和最大且小于等于 10 的子数组的个数，[1, 2, 3, 4], [5]，可以看到无法分为
 3组，说明 mid 偏大，所以让 right=mid，然后再次进行二分查找，算出 mid=7，再次找出和最大且小于等于7的子数组的个数，[1,2,3], [4], [5]，成功的找出了三组，说明
 mid 还可以进一步降低，让 right=mid，再次进行二分查找，算出 mid=6，再次找出和最大且小于等于6的子数组的个数，[1,2,3], [4], [5]，成功的找出了三组，尝试着继续
 降低 mid，让 right=mid，再次进行二分查找，算出 mid=5，再次找出和最大且小于等于5的子数组的个数，[1,2], [3], [4], [5]，发现有4组，此时的 mid 太小了，应该增
 大 mid，让 left=mid+1，此时 left=6，right=6，循环退出了，返回 right 即可
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
