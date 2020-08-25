package typeMoudle.stack;

/**
 * Created by wWX945273 on 2020/8/25.
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

/**
 496. Next Greater Element I 下一个较大的元素之一

 You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

 The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

 Example 1:

 Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 Output: [-1,3,-1]
 Explanation:
 For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 For number 1 in the first array, the next greater number for it in the second array is 3.
 For number 2 in the first array, there is no next greater number for it in the second array, so output -1.

 Example 2:

 Input: nums1 = [2,4], nums2 = [1,2,3,4].
 Output: [3,-1]
 Explanation:
 For number 2 in the first array, the next greater number for it in the second array is 3.
 For number 4 in the first array, there is no next greater number for it in the second array, so output -1.

 Note:

 All elements in nums1 and nums2 are unique.
 The length of both nums1 and nums2 would not exceed 1000.
 */
public class 下一个较大的元素之一_496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[nums1.length];

        for (int i=nums2.length-1; i>=0; i--){
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]){
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty()? -1: nums2[stack.peek()]);
            stack.push(i);
        }

        for (int j=0; j<nums1.length; j++){
            res[j] = map.get(nums1[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] res = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
