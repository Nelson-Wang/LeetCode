package com;

/**
 * Created by wWX945273 on 2021/2/25.
 */
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] nums = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 || j < n2){
            if (i == n1){
                nums[k] = nums2[j];
                j++;
            }else if (j == n2){
                nums[k] = nums1[i];
                i++;
            }else {
                if (nums1[i] < nums2[j]){
                    nums[k] = nums1[i];
                    i++;
                }else {
                    nums[k] = nums2[j];
                    j++;
                }
            }
            k++;
        }
        double median = 0;
        if (n % 2 != 0){
            median = nums[n / 2];
        }else {
            median = (double) (nums[n / 2] + nums[n / 2 - 1]) / 2;
        }
        return median;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double median = solution4.findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }
}
