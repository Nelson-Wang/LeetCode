package com;

/**
 * Created by wWX945273 on 2020/12/16.
 * 采用滚动数组，将o(M*N)空间复杂度，转为o(N)空间复杂度
 */
public class Solution64_2 {
    public int minPathSum(int[][] grid) {
        //f[i][j] = min(f[i-1][j]+grid[i][j], f[i][j-1]+grid[i][j]);
        int m = grid.length;
        int n = grid[0].length;
        int[][] f = new int[2][n];
        int now = 0, old =1;
        int t1, t2;
        for (int i=0; i<m; i++){
            //处理完一行，前后行转变
            old = now;
            now = 1 - now;
            for (int j=0; j<n; j++){
                //初始条件
                //左上角（0,0）
                if (i==0 && j==0){
                    f[now][j] = grid[i][j];
                    continue;
                }
                f[now][j] = grid[i][j];
                if (i>0){
                    //f[i-1][j]
                    //如果有前一行，取出前一行的值
                    t1 = f[old][j];
                }else {
                    t1 = Integer.MAX_VALUE;
                }
                if (j>0){
                    //f[i][j-1]
                    t2 = f[now][j-1];
                }else {
                    t2 = Integer.MAX_VALUE;
                }
                //不会同时为Integer.MAX_VALUE
                if (t1<t2){
                    f[now][j] += t1;
                }else {
                    f[now][j] += t2;
                }
            }
        }
        return f[now][n-1];
    }
}
