package typeMoudle.binarySearch;

/**
 * Created by wWX945273 on 2020/8/19.
 */

/**
 35. Search Insert Position 搜索插入位置

 Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Example 1:

 Input: [1,3,5,6], 5
 Output: 2
 Example 2:

 Input: [1,3,5,6], 2
 Output: 1
 Example 3:

 Input: [1,3,5,6], 7
 Output: 4
 Example 4:

 Input: [1,3,5,6], 0
 Output: 0
 */

/**
 思路：使用二分法查找，循环条件设为left < right-1,缩减搜索空间为right = mid，left = mid，如果找到target，直接返回索引位置，

 找不到则在只有包括索引值有两个值的区间结束循环，right的索引为返回值
 */
public class 搜索插入位置_35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        if (nums[right] < target){
            return nums.length;
        }else if (nums[left] > target){
            return 0;
        }else {
            while (left < right-1){
                int mid = left + (right-left)/2;
                if (nums[mid] == target){
                    return mid;
                }else if(nums[mid] > target){
                    right = mid;
                }else {
                    left = mid;
                }
            }
            return nums[left]==target? left:right;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }
}
