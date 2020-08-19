package typeMoudle.binarySearch;

/**
 * Created by wWX945273 on 2020/8/19.
 */

import java.util.Arrays;

/**
 611. Valid Triangle Number 合法的三角形个数

 Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that

 can make triangles if we take them as side lengths of a triangle.

 Example 1:

 Input: [2,2,3,4]
 Output: 3
 Explanation:
 Valid combinations are:
 2,3,4 (using the first 2)
 2,3,4 (using the second 2)
 2,2,3


 Note:

 The length of the given array won't exceed 1000.
 The integers in the given array are in the range of [0, 1000].
 */

/**
 思路：三个数字中如果较小的两个数字之和大于第三个数字，那么任意两个数字之和都大于第三个数字，将nums数组排序，先确定前两个数，

 将这两个数之和sum作为目标值，然后用二分查找法来快速确定最后一个小于目标值的数
 */
public class 合法的三角形个数_611 {
    public static int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            for (int j=i+1; j<nums.length-1; j++){
                int sum = nums[i] + nums[j];
                int left = j+1, right = nums.length-1;
                if (sum <= nums[left]){
                    continue;
                }
                while (left < right){
                    int mid = left + (right-left+1)/2;
                    if (nums[mid] >= sum){
                        right = mid - 1;
                    }else {
                        left = mid;
                    }
                }
                count += (left-j);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,4,4};
        System.out.println(triangleNumber(nums));
    }
}
