package lintcode;

import sun.invoke.util.VerifyAccess;

/**
 * Created by wWX945273 on 2020/12/15.
 */
public class Solution440 {
    public int backPack(int m, int[]A, int[]value){
        int n = A.length;
        //f[i]:拼出w重量时的最大价值，-1表示不能拼成
        int[] f = new int[m+1];
        f[0] = 0;
        for (int i=1; i<m+1; i++){
            f[i] = -1;
            for (int j=0; j<n; j++){
                if (i>=A[j] && f[i-A[j]]!=-1){
                    f[i] = Math.max(f[i], f[i-A[j]]+value[j]);
                }
            }
        }

        int maxValue = f[0];
        for (int i=1; i<m+1; i++){
            if (f[i]>maxValue) maxValue = f[i];
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Solution440 solution440 = new Solution440();
        int[] A = {1,2,3};
        int[] value = {1,2,3};
        int i = solution440.backPack(5, A, value);
        System.out.println(i);
    }
}
