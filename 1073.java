package com;

/**
 * Created by wWX945273 on 2020/11/12.
 */

/**
 * Input: [[1,1],[2,3],[3,2]]
 Output: true
 */
public class Solution1037 {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];
        if (x1 == x2){
            if (x2 == x3){
                return false;
            }
            return true;
        }
        if (x2 == x3){
            return true;
        }

        float k1 = (float) (y2-y1)/(float) (x2-x1);
        float k2 = (float)(y3-y2)/(float)(x3-x2);
        if (k1 == k2){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1037 solution1037 = new Solution1037();
        int[][] points = {{1,1},{1,2},{2,3}};
        boolean flag = solution1037.isBoomerang(points);
        System.out.println(flag);
    }
}
