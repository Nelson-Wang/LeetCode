package com;

/**
 * Created by wWX945273 on 2020/12/14.
 */
public class Solution279 {
    public int numSquares(int n) {
        //f[i]:表示i最少被划分为多少个平方和

        int[] f = new int[n+1];
        f[0] = 0;
        for (int i=1; i<n+1; i++){
            f[i] = Integer.MAX_VALUE;
            for (int j=1; j*j<=i; j++){
                f[i] = Math.min(f[i], f[i-j*j]+1);
            }
        }
        return f[n];
    }
}
