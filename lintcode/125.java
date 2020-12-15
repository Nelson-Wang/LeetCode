package lintcode;

/**
 * Created by wWX945273 on 2020/12/15.
 */
public class Solution125 {
    public int backPack(int m, int[]A, int[]cost){
        int n = A.length;
        //f[i][w]:前i个物品拼出m重量时的最大价值(-1表示不能拼出该重量)
        int[][] f = new int[n+1][m+1];
        f[0][0] = 0;
        for (int j=1;j<m+1; j++){
            f[0][j] = -1;
        }

        for (int i=1; i<n+1; i++){
            for (int j=0; j<m+1; j++){
                if (j==0){
                    f[i][j] = 0;
                }
                f[i][j] = f[i-1][j];
                if (j>=A[i-1] && f[i-1][j-A[i-1]]!=-1){
                    f[i][j] = Math.max(f[i][j], f[i-1][j-A[i-1]]+cost[i-1]);
                }
            }
        }
        int maxCost = f[n][0];
        for (int j=1; j<m+1; j++){
            if (f[n][j]>maxCost) maxCost = f[n][j];
        }
        return maxCost;
    }

    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        int[] A = {2,3,5,7};
        int[] V = {1,5,2,4};
        int i = solution125.backPack(10, A, V);
        System.out.println(i);
    }
}
