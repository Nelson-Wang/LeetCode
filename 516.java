package com;

/**
 * Created by wWX945273 on 2020/12/16.
 */
public class Solution516 {
    public int longestPalindromeSubseq(String s) {
        char[] ss = s.toCharArray();
        int n = ss.length;
        //f[i][j]:区间[i,j]里最大的回文子序列长度
        int[][] f = new int[n][n];

        //区间长度为1
        for (int i=0; i<n; i++){
            f[i][i] = 1;
        }
        //区间长度为2
        for (int i=0; i<n-1; i++){
        f[i][i+1] = ss[i]==ss[i+1]? 2: 1;
        }

        //定义区间长度
        int len;
        for (len=3; len<=n; len++){
            //定义i
            for (int i=0; i<=n-len; i++){
                //定义j
                int j = i+len-1;
                f[i][j] = Math.max(f[i+1][j], f[i][j-1]);
                if (ss[i]==ss[j]){
                    f[i][j] = Math.max(f[i][j], f[i+1][j-1]+2);
                }
            }
        }
        return f[0][n-1];
    }
}
