package com;

/**
 * Created by wWX945273 on 2020/12/9.
 */
public class Solution256Star {
    public int minCost(int[][] cost){
        if (cost.length==0) return 0;
        int[][] f = new int[cost.length+1][3];

        f[0][0] = f[0][1] = f[0][2] = 0;
        for (int i=1; i<f.length; i++){
            //j为第i-1栋房子的颜色
            for (int j=0; j<3; j++){
                f[i][j] = Integer.MAX_VALUE;
                //k为第i-2栋房子的颜色
                for(int k=0; k<3;k++){
                    if (j==k){
                        continue;
                    }
                    f[i][j] = Math.min(f[i][j], f[i-1][k]+cost[i-1][j]);
                }
            }
        }
        return Math.min(Math.min(f[cost.length][0], f[cost.length][1]), f[cost.length][2]);
    }

    public static void main(String[] args) {
        int[][] cost = {{1,5,3},{2,9,4}};
        Solution256Star solution265Star = new Solution256Star();
        int i = solution265Star.minCost(cost);
        System.out.println(i);
    }
}
