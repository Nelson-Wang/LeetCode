package com;

/**
 * Created by wWX945273 on 2020/12/17.
 * 87. Scramble String
 */
public class Solution87 {
    public boolean isScramble(String s1, String s2) {
        if (s1.length()!=s2.length()) return false;
        int n = s1.length();

        //因为S/T的长度相同，所有使用初始位置+长度表示一段区间
        //f[i][j][k]:T(i, i+k-1)是否可以由S(j, j+k-1)转换而来
        boolean[][][] f = new boolean[n][n][n+1];


        //初始条件
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                f[i][j][1] = s1.charAt(i)==s2.charAt(j);
            }
        }
        int k;
        for (k=2; k<=n; k++){
            for (int i=0; i<=n-k; i++){
                for (int j=0; j<=n-k; j++){
                    f[i][j][k] = false;
                    for (int w=1; w<k; w++){
                        if (f[i][j][w] && f[i+w][j+w][k-w]){
                            f[i][j][k] = true;
                            break;
                        }
                        if (f[i][j+k-w][w] && f[i+w][j][k-w]){
                            f[i][j][k] = true;
                            break;
                        }
                    }
                }
            }
        }
        return f[0][0][n];
    }
}
