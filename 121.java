package com;

/**
 * Created by wWX945273 on 2020/12/10.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        //f[i]:i天的时候的利润最大值
        int n= prices.length;
        if(n==0) return 0;
        int[] f = new int[n];

        f[0] = 0;
        int minPrice = prices[0];
        for (int i=1; i<n; i++){
            if (prices[i]<minPrice){
                minPrice = prices[i];
            }
            f[i] = Math.max(prices[i]-minPrice, f[i-1]);
        }
        return f[n-1];
    }

    public static void main(String[] args) {
        Solution121 solution121 = new Solution121();
        int[] prices = {7,1,5,3,6,4};
        int i = solution121.maxProfit(prices);
        System.out.println(i);
    }
}
