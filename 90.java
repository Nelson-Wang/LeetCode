package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/23.
 * 90. Subsets II
 */
public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0){
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        subsetsHelper(result, list, nums, 0);
        return result;
    }
    private void subsetsHelper(List<List<Integer>> result, ArrayList<Integer> list, int[] nums, int pos){
        result.add(new ArrayList<Integer>(list));
        for (int i = pos; i<nums.length; i++){
            if (i != pos && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            subsetsHelper(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Solution90 solution90 = new Solution90();
        List<List<Integer>> list = solution90.subsetsWithDup(nums);
        System.out.println(list);


    }
}
