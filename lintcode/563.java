package lintcode;

/**
 * Created by wWX945273 on 2020/12/15.
 */
public class Solution563 {
    public int backPack(int target, int[]A){
        int n = A.length;
        //f[i][j]:前i个数可以拼出j的方式数
        int[][] f = new int[n+1][target+1];
        for (int i=0; i<n+1; i++){
            f[i][0] = 1;
        }
        for (int j=1; j<target+1; j++){
            f[0][j] = 0;
        }
        for (int i=1; i<n+1; i++){
            //前i-1个物品可以拼出wd的方式数+前i-1个物品可以拼出W-A[i-1]的方式数
            for (int j =1; j<target+1; j++){
                f[i][j] += f[i-1][j];
                if (j>=A[i-1]){
                    f[i][j] += f[i-1][j-A[i-1]];
                }
            }
        }
        return f[n][target];
    }

    public static void main(String[] args) {
        Solution563 solution563 = new Solution563();
        int[] A = {1,2,3,3,7};
        int i = solution563.backPack(7, A);
        System.out.println(i);
    }
}
