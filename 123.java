package com;

/**
 * Created by wWX945273 on 2020/12/11.
 */
public class Solution123 {
    public int maxProfit(int[] prices) {

        //f[i][j]:前i天（第i-1天结束后）处于j阶段获得的最大利润
        int n = prices.length;
        int[][] f = new int[n+1][5+1];
        f[0][1] = 0;
        f[0][2] = f[0][3] = f[0][4] = f[0][5] = Integer.MIN_VALUE;

        for (int i=1; i<n+1; i++){
            for (int j=1; j<=5; j++){
                //max{f[i-1][j], f[i-1][j-1] + prices[i-1]-prices[i-2]}
                if (j==1 || j==3 || j==5){
                    f[i][j] = f[i-1][j];
                    if (i>=2 && j>1 && f[i-1][j-1]!=Integer.MIN_VALUE){
                        f[i][j] =  Math.max(f[i][j], f[i-1][j-1] + prices[i-1]-prices[i-2]);
                    }
                }
                //max{f[i-1][j] + prices[i-1]-prices[i-2],  f[i-1][j-1], f[i-1][j-2] + prices[i-1]-prices[i-2]}
                if (j==2 || j==4){
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
        for (int i=2; i<6; i++){
            if (f[n][i]>max) max = f[n][i];
        }
        return max;
    }
}
