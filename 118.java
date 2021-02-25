package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2021/2/24.
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> triangle = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            List<Integer> now = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    now.add(1);
                }else {
                    now.add(pre.get(j-1) + pre.get(j));
                }
            }
            triangle.add(now);
            if (!pre.isEmpty()){
                pre.clear();
            }
            for (int k = 0; k < now.size(); k++){
                pre.add(now.get(k));
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        Solution118 solution118 = new Solution118();
        List<List<Integer>> generate = solution118.generate(5);
        System.out.println(generate);
    }
}
