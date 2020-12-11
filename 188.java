package com;

/**
 * Created by wWX945273 on 2020/12/11.
 */
public class Solution188 {
    public int maxProfit(int k, int[] prices) {
        if (k==0) return 0;
        int n = prices.length;
        if (n==0) return 0;
        int[][] f = new int[n+1][2*k+2];
        //初始化
        f[0][1] = 0;
        for (int j=2; j<2*k+2; j++) f[0][j] = Integer.MIN_VALUE;

        for (int i=1; i<n+1; i++){
            for (int j=1; j<2*k+2; j++){

                //手中无股票阶段
                //max{f[i-1][j], f[i-1][j-1] + prices[i-1]-prices[i-2]}
                if (j%2==1){
                    f[i][j] = f[i-1][j];
                    if (i>=2 && j>=2 && f[i-1][j-1]!=Integer.MIN_VALUE){
                        f[i][j] = Math.max(f[i][j], f[i-1][j-1] + prices[i-1]-prices[i-2]);
                    }
                }
                //手中有股票
                //max{f[i-1][j] + prices[i-1]-prices[i-2],  f[i-1][j-1], f[i-1][j-2] + prices[i-1]-prices[i-2]}
                if (j%2==0){
                    f[i][j] = f[i-1][j-1];
                    if (i>=2 && j>2 && f[i-1][j-2]!=Integer.MIN_VALUE){
                        f[i][j] = Math.max(f[i][j], f[i-1][j-2] + prices[i-1]-prices[i-2]);
                    }
                    if (i>=2 && f[i-1][j] != Integer.MIN_VALUE ){
                        f[i][j] = Math.max(f[i][j], f[i-1][j] + prices[i-1]-prices[i-2]);
                    }
                }
            }
        }

        int max = f[n][1];
        for (int i=2; i<2*k+2; i++){
            if (f[n][i]>max) max = f[n][i];
        }
        return max;
    }
}
