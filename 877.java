package com;

/**
 * Created by wWX945273 on 2020/12/18.
 */
public class Solution877 {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        //f[i][j]:在区间[i,j]为先手与后手的最大分数差
        int[][] f = new int[n][n];
        for (int i=0; i<n; i++){
            f[i][i] = piles[i];
        }

        int len;
        for (len=2; len<=n; len++){
            for (int i=0; i<=n-len; i++){
                int j = i+len-1;
                f[i][j] = Math.max(piles[i]-f[i+1][j], piles[j]-f[i][j-1]);
            }
        }
        return f[0][n-1]>=0;
    }
}
