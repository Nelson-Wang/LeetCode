package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/23.
 */
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        subsetsHelper(result, list, nums, 0);
        return result;
    }

    private void subsetsHelper(List<List<Integer>> result, ArrayList<Integer> list, int[] nums, int pos){
        result.add(new ArrayList<Integer>(list));
        for (int i = pos; i<nums.length; i++){
            list.add(nums[i]);
            subsetsHelper(result, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }
}
