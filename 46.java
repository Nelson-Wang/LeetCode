package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2021/5/11.
 */
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int[] visited = new int[nums.length];
        help(nums, res, out, visited, 0);
        return res;
    }
    public void help(int[] nums, List<List<Integer>> res, List<Integer> out, int[] visited, int level){
        if (level == nums.length){
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < out.size(); i++){
                tmp.add(out.get(i));
            }
            res.add(tmp);
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (visited[i] == 1){
                continue;
            }
            visited[i] = 1;
            out.add(nums[i]);
            help(nums, res, out, visited, level+1);
            visited[i] = 0;
            out.remove(out.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = solution46.permute(nums);
        System.out.println(permute);
    }
}
