package com;

/**
 * Created by wWX945273 on 2021/3/2.
 */
public class Solution201 {
    public int rangeBitwiseAnd(int m, int n) {
        if (m == Integer.MAX_VALUE){
            return m;
        }
        int ans = m;
        for (int i = m; i <= n; i++){
            ans &= i;
            if (ans == 0 || i == Integer.MAX_VALUE){
                break;
            }
        }
        return ans;
    }
}
