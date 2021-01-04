package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2021/1/4.
 */
public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++){
            boolean flag = true;
            int n = i;
            while (n > 0){
                int tmp = n % 10;
                if (tmp ==0 || i % tmp != 0){
                    flag = false;
                    break;
                }
                n /= 10;
            }
            if (flag){
                list.add(i);
            }
        }
        return list;
    }
}
