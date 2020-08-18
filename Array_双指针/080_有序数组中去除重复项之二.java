package module.双指针;

/**
 * Created by wWX945273 on 2020/8/18.
 */

/**
 80. Remove Duplicates from Sorted Array II 有序数组中去除重复项之二

 Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 Example 1:

 Given nums = [1,1,1,2,2,3],

 Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

 It doesn't matter what you leave beyond the returned length.
 Example 2:

 Given nums = [0,0,1,1,1,1,2,3,3],

 Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.

 It doesn't matter what values are set beyond the returned length.
 */

/**
 思路：使用双指针的同向法，由于nums数组是有序的，只需将nums[j]与nums[i-2]比较即可，不同则nums[i] = num[j]，并将i++，否则则跳过
 */
public class 有序数组中去除重复项之二_80 {
    public static int removeDuplicates(int[] nums){
        int i = 0;
        int j = 0;
        while (j < nums.length){
            if (i == 0 || i == 1 || nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
