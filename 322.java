package com;


/**
 * Created by wWX945273 on 2020/12/7.
 */
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        //数组初始化
        int[] f = new int[amount+1];

        //初始条件
        f[0] = 0;

        for (int i=1; i<=amount; i++){
            f[i] = Integer.MAX_VALUE;
            //f[x] = min{f[X-2]+1, F[X-5]+1, f[X-7]+1}
            for (int j=0; j<coins.length; j++){
                if (i-coins[j]>=0 && f[i-coins[j]]!=Integer.MAX_VALUE){
                    f[i] = Math.min(f[i], f[i-coins[j]]+1);
                }
            }
        }
        if (f[amount]==Integer.MAX_VALUE) f[amount] = -1;
        return f[amount];
    }
}
