package com;

import java.util.HashSet;

/**
 * Created by wWX945273 on 2020/12/30.
 */
public class Solution202 {
    public int sumOfSquares(int n){
        int sum = 0;
        while (n > 0){
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.contains(-1);
        while (!set.contains(n)){
            set.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }
}
