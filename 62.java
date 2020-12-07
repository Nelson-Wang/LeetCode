package com;

/**
 * Created by wWX945273 on 2020/12/7.
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        //开二维数组
        int[][] f = new int[m][n];

        //f[x][y] = f[x-1][y] + f[x][y-1]

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                // 初始化
                if(i==0 || j==0){
                    f[i][j] = 1;
                } else{
                    f[i][j] = f[i-1][j] + f[i][j-1];
                }
            }
        }
        return f[m-1][n-1];
    }
}
