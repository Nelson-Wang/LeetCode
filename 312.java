package com;

/**
 * Created by wWX945273 on 2020/12/17.
 * 312. Burst Balloons
 */
public class Solution312 {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] A = new int[n+2];
        A[0] = A[n+1] = 1;
        for (int i=1; i<n+1; i++){
            A[i] = nums[i-1];
        }
        //f[i][j]:从i到j扎气球获得的最大金币数，其中i,j不能扎
        int[][] f = new int[n+2][n+2];

        //初始条件
        //至少要有三个球，有两个即为0
        for (int i=0; i<n+1; i++){
            f[i][i+1] = 0;
        }

        //f[i][j] = f[i,k] + f[k, j] + A[i]*A[k]*A[j]  (i<k<j)中的最大值
        int len;//j-1+1,区间长度
        for (len=3; len<=n+2; len++){
            for (int i=0; i<=n-len+2; i++){
                int j = i+len-1;
                f[i][j] = 0;
                for (int k=i+1; k<j; k++){
                    f[i][j] = Math.max(f[i][k] + f[k][j] + A[i] * A[k] * A[j], f[i][j]);
                }
            }
        }
        return f[0][n+1];
    }
}
