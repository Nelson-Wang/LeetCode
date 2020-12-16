package lintcode;

/**
 * Created by wWX945273 on 2020/12/16.
 * 使用一维数组进行优化
 */
public class Solution563_2 {
    public int backPack(int target, int[]A){
        int n = A.length;
        int[] f = new int[target+1];
        //假设数组为f[i][j]类型进行书写
        f[0] = 1;
        for (int j=1; j<target+1; j++){
            f[j] = 0;
        }

        for (int i=1; i<n+1; i++){
            //从后向前
            for (int j=target; j>=0; j--){
                if (j>=A[i-1]){
                    f[j] = f[j] + f[j-A[i-1]];
                }
            }
        }
        return f[target];
    }
}
