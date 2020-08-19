package typeMoudle.binarySearch;

/**
 * Created by wWX945273 on 2020/8/19.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 [Intersection of Two Arrays 两个数组相交

 Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:

 Each element in the result must be unique.
 The result can be in any order.
 */

/**
 思路：使用二分查找法，将一个数组排序，然后遍历另一个数组，把遍历到的每个数字在排序好的数组中用二分查找法搜索，如果能找到则放入结果set中，

 这里用到了set的去重复的特性，最后将set转为vector即可
 */
public class 两个数组相交_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> set = new HashSet<>();
        for (int i : nums2){
            if (binarySearch(nums1, i)){
                set.add(i);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        int[] inter = new int[set.size()];
        int i =0;
        while (iterator.hasNext()){
            inter[i] = iterator.next();
            i++;
        }
        return inter;
    }

    public static boolean binarySearch(int[] nums,int target){
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = left +(right-left)/2;
            if (nums[mid] == target){
                return true;
            }else if (nums[mid] > target){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2,1,2,3};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
}
