package com;

/**
 * Created by wWX945273 on 2020/12/10.
 */
public class Solution265Star_2 {
    public int minCost(int[][] cost) {
        //f[i][k]:前i栋房子染色的最小花费且第i-1房子染色方式为k
        int n = cost.length;
        int k = cost[0].length;
        int[][] f = new int[n + 1][k];
        int min1, min2;
        int j1, j2;

        //初始化
        for (int j=0; j<k; j++){
            f[0][j] = 0;
        }

        for (int i=1; i<n+1; i++){
            min1 = min2 = Integer.MAX_VALUE;
            j1 = j2 = 0;
            for (int j=0; j<k; j++){
                if (f[i-1][j] < min1){
                    min2 = min1;
                    j2 = j1;
                    min1= f[i-1][j];
                    j1 = j;
                }else {
                    if (f[i-1][j] < min2){
                        min2 = f[i-1][j];
                        j2 = j;
                    }
                }
            }

            for (int j=0; j<k; j++){
                if (j!=j1){
                    f[i][j] = f[i-1][j1] + cost[i-1][j];
                }else {
                    f[i][j] = f[i-1][j2] + cost[i-1][j];
                }
            }

        }

        int minCost = f[n][0];
        for (int i=1; i<k; i++){
            if (f[n][i]<minCost) minCost= f[n][i];
        }
        return minCost;
    }

    public static void main(String[] args) {
        int[][] cost = {{1,5,3},{2,9,4}};
        Solution265Star_2 solution265Star_2 = new Solution265Star_2();
        int i = solution265Star_2.minCost(cost);
        System.out.println(i);
    }


}
