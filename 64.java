package com;

/**
 * Created by wWX945273 on 2020/12/8.
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        int M = grid.length;
        int N = grid[0].length;
        int[][] f = new int[M][N];

        //初始条件
        f[0][0] = grid[0][0];

        for (int i=0; i<M; i++){
            for (int j =0; j<N; j++){
                if (i==0){
                    if (j==0) continue;
                    f[i][j] = f[i][j-1] + grid[i][j];
                }else if (j==0){
                    f[i][j] = f[i-1][j] + grid[i][j];
                } else {
                    f[i][j] = Math.min(f[i-1][j]+grid[i][j], f[i][j-1]+grid[i][j]);
                }
            }
        }
        return f[M-1][N-1];
    }
}
