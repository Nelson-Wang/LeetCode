package com;

import java.util.List;

/**
 * Created by wWX945273 on 2021/2/25.
 */
public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        //f[i][j]:前i行第j个值时的最小路径
        int row = triangle.size();
        int column = triangle.get(row-1).size();

        int[][] f = new int[row][column];
        f[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < row; i++){
            for (int j = 0; j < triangle.get(i).size(); j++){
                if (j == 0){
                    f[i][j] = f[i-1][j] + triangle.get(i).get(j);
                }else if (j == triangle.get(i).size()-1){
                    f[i][j] = f[i-1][j-1] + triangle.get(i).get(j);

                }else {
                    f[i][j] = Math.min(f[i-1][j], f[i-1][j-1]) + triangle.get(i).get(j);
                }
            }
        }
        int min = f[row-1][0];
        for (int k = 0; k < column; k++){
            min = Math.min(f[row-1][k], min);
        }
        return min;
    }
}
