package com;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by wWX945273 on 2021/1/4.
 * 970. Powerful Integers
 */
public class Solution970 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (Math.pow(x, i) + Math.pow(y, 0) <= bound){
            int j = 0;
            double sum = Math.pow(x, i) + Math.pow(y, j);
            while (sum <= bound){
                if (!list.contains((int)sum)){
                    list.add((int)sum);
                }
                if (y == 1){
                    break;
                }
                j++;
                sum = Math.pow(x, i) + Math.pow(y, j);
            }
            if (x == 1){
                break;
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        Solution970 solution970 = new Solution970();
        List<Integer> integers = solution970.powerfulIntegers(2, 1, 10);
        System.out.println(integers);
    }
}
