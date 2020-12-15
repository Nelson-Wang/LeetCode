package lintcode;

/**
 * Created by wWX945273 on 2020/12/14.
 */
public class Solution92 {
    public int backPack(int m, int[]A){
        if (m==0) return 0;
        //f[i][w]:前i个物品能否拼出重量w
        int n = A.length;
        boolean[][] f = new boolean[n+1][m+1];
        f[0][0] = true;
        for (int j=1; j<m+1; j++){
            f[0][j] = false;
        }
        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                //前i-1个物品可以拼出w,则前i个物品可以拼出w，前i-1个物品可以拼出W-A[i-1],则前i个物品可以拼出W
                if (f[i-1][j] || (j>=A[i-1] && f[i-1][j-A[i-1]])){
                    f[i][j] = true;
                }
            }
        }
        for (int i=m; i>=0; i--){
            if (f[n][i]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution92 solution92 = new Solution92();
        int[] A = {2,3,5,7};
        int i = solution92.backPack(11, A);
        System.out.println(i);
    }
}
