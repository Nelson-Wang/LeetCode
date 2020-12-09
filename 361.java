package com;

/**
 * Created by wWX945273 on 2020/12/9.
 */
public class Solution361Star {
    public int maxKillEnemies(char[][] A){
        if (A == null || A.length == 0 || A[0].length == 0) return 0;
        int m = A.length;
        int n = A[0].length;
        //f[i][j]:在（i, j）位置放炸弹对某一个方向上可以炸敌人的个数
        //res[i][j]:在（i, j）位置放炸弹可以炸敌人的个数
        int[][] f = new int[m][n];
        int[][] res = new int[m][n];

        //up方向
        //空地可以向上炸的敌人=f[i-1][j]
        //有敌人处可以向上炸的敌人=f[i-1][j]+1
        //有墙处可以向上炸的敌人=0
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (A[i][j]=='W'){
                    f[i][j] = 0;
                }else {
                    f[i][j] = 0;
                    if (i>0){
                        f[i][j] += f[i-1][j];
                    }
                    if (A[i][j] == 'E'){
                        f[i][j] += 1;
                    }
                }
                res[i][j] += f[i][j];
            }
        }

        //down方向(需要先知道下面位置能炸到的人数)
        for (int i=m-1; i>=0; i--){
            for (int j=0; j<n; j++){
                if (A[i][j]=='W'){
                    f[i][j] = 0;
                }else {
                    f[i][j] = 0;
                    if (i<m-1){
                        f[i][j] += f[i+1][j];
                    }
                    if (A[i][j] == 'E'){
                        f[i][j] += 1;
                    }
                }
                res[i][j] += f[i][j];
            }
        }

        //left方向
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (A[i][j]=='W'){
                    f[i][j] = 0;
                }else {
                    f[i][j] = 0;
                    if (j>0){
                        f[i][j] += f[i][j-1];
                    }
                    if (A[i][j] == 'E'){
                        f[i][j] += 1;
                    }
                }
                res[i][j] += f[i][j];
            }
        }

        //right方向(需要先知道右边位置能炸到的人数)
        for (int i=0; i<m; i++){
            for (int j=n-1; j>=0; j--){
                if (A[i][j]=='W'){
                    f[i][j] = 0;
                }else {
                    f[i][j] = 0;
                    if (j<n-1){
                        f[i][j] += f[i][j+1];
                    }
                    if (A[i][j] == 'E'){
                        f[i][j] += 1;
                    }
                }
                res[i][j] += f[i][j];
            }
        }
        //找到(x,y)为空且能炸到人最多的为result
        int result = 0;
        for (int x=0; x<m; x++){
            for (int y=0; y<n; y++){
                if (A[x][y] == '0'){
                    if (res[x][y]>result){
                        result = res[x][y];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution361Star solution361Star = new Solution361Star();
        char[][] A = {{'0', 'E', '0', '0'},
                      {'E', '0', 'W', 'E'},
                      {'0', 'E', '0', '0'}};
        int i = solution361Star.maxKillEnemies(A);
        System.out.println(i);
    }
}
