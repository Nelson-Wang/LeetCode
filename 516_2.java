package com;

/**
 * Created by wWX945273 on 2020/12/16.
 * 使用记忆化搜索方法
 */
public class Solution516_2 {
    char[] ss;
    int[][] f;

    //计算f[i][j]的值
    private void compute(int i, int j) {
        if (f[i][j]!=-1){
            return;
        }
        //dp的初始条件即为递归的结束条件
        if (i==j){
            f[i][j] = 1;
            return;
        }
        if (i+1==j){
            f[i][j] = ss[i]==ss[j]? 2: 1;
            return;
        }
        compute(i+1, j);
        compute(i, j-1);
        compute(i+1, j-1);
        f[i][j] = Math.max(f[i+1][j], f[i][j-1]);
        if (ss[i] == ss[j]){
            f[i][j] = Math.max(f[i][j], f[i+1][j-1]+2);
        }
    }
    public int longestPalindromeSubseq(String s) {
        int n =s.length();
        ss = s.toCharArray();
        f = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                //先全部设置为未被计算
                f[i][j] = -1;
            }
        }
        compute(0, n-1);
        return f[0][n-1];
    }
}
