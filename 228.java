package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (nums==null || nums.length == 0) return arrayList;
        if (nums.length==1) {
            arrayList.add(String.valueOf(nums[0]));
        }
        int i=0, j=1;
        while (i<nums.length && j<nums.length){
            if (nums[j-1]+1==nums[j] || nums[j-1]==nums[j]){
                if (j==nums.length-1){
                    arrayList.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[j]));
                }
                j++;
            }else {
                String str;

                if (nums[i]!=nums[j-1]){
                    str = String.valueOf(nums[i])+"->"+String.valueOf(nums[j-1]);
                }else {
                    str = String.valueOf(nums[i]);
                }
                arrayList.add(str);
                if (j==nums.length-1){
                    arrayList.add(String.valueOf(nums[j]));
                }
                i = j;
                j++;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Solution228 solution228 = new Solution228();
        int[] nums = {-1};
        List<String> strings = solution228.summaryRanges(nums);
        System.out.println(strings);
    }
}
