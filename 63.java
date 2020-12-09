package com;

/**
 * Created by wWX945273 on 2020/12/8.
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int M = obstacleGrid.length;
        int N = obstacleGrid[0].length;
        //创建数组
        int[][] f = new int[M][N];

        for (int i=0; i<M; i++){
            for (int j=0; j<N; j++){
                //状态方程（自己和前一步不能有障碍）
                if (obstacleGrid[i][j]==1){
                    f[i][j] = 0;
                }else {
                    //初始条件
                    if (i==0 && j==0){
                        f[0][0] =1;
                    }else {
                        f[i][j] = 0;
                        if (i-1>=0){
                            f[i][j] += f[i-1][j];
                        }
                        if (j-1>=0){
                            f[i][j] += f[i][j-1];
                        }
                    }
                }
            }
        }
        return f[M-1][N-1];
    }
}
