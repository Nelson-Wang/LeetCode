package com;

/**
 * Created by wWX945273 on 2021/2/25.
 */
public class Solution1137 {
    public int tribonacci(int n) {
        int[] f = new int[n + 1];
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 1;
        }
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < n + 1; i++){
            f[i] = f[i-1] + f[i-2] + f[i-3];
        }
        return f[n];
    }
}
