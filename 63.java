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
        //初始条件
        for (int k=0; k<N; k++){
            if (obstacleGrid[0][k]!=1){
                f[0][k] = 1;
            }else {
                break;
            }
        }
        for (int m=0; m<M; m++){
            if (obstacleGrid[m][0]!=1){
                f[m][0] = 1;
            }else {
                break;
            }
        }


        for (int i=1; i<M; i++){
            for (int j=1; j<N; j++){
                //状态方程（自己和前一步不能有障碍）
                if (obstacleGrid[i][j]==1){
                    f[i][j] = 0;
                }else {
                    if (obstacleGrid[i-1][j]!=1 && obstacleGrid[i][j-1]!=1){
                        f[i][j] = f[i-1][j] + f[i][j-1];
                    }else if (obstacleGrid[i-1][j]==1 && obstacleGrid[i][j-1]!=1){
                        f[i][j] = f[i][j-1];
                    }else if (obstacleGrid[i-1][j]!=1 && obstacleGrid[i][j-1]==1){
                        f[i][j] = f[i-1][j];
                    }else {
                        f[i][j] = 0;
                    }
                }
            }
        }
        return f[M-1][N-1];
    }
}
