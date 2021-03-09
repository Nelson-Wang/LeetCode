package contest;

import java.util.Arrays;

/**
 * Created by wWX945273 on 2021/3/9.
 */
public class Solution1769 {
    public int[] minOperations(String boxes) {
        int length = boxes.length();
        //f[i][j]:从左边向当前位置i移动球所需的步骤(j为i之前的所有1)
        int[][] f = new int[length][2];
        f[0][0] = 0; //球个数
        f[0][1] = 0; //移动步骤
        for (int i = 1; i < length; i++){
            f[i][0] = f[i-1][0];
            if (boxes.charAt(i-1) == '1'){
                f[i][0] += 1;
            }
            f[i][1] = f[i-1][1] + f[i][0];
        }

        //d[i][j]:从右边向当前位置i移动球所需的步骤
        int[][] d = new int[length][2];
        d[length - 1][0] = 0;
        d[length - 1][1] = 0;
        for (int i = length - 2; i >=0; i--){

            d[i][0] = d[i+1][0];

            if (boxes.charAt(i+1) == '1'){
                d[i][0] += 1;
            }
            d[i][1] = d[i+1][1] + d[i][0];
        }

        int[] ans = new int[length];
        for (int i = 0; i < length; i++){
            ans[i] = f[i][1] + d[i][1];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1769 solution1769 = new Solution1769();
        int[] ints = solution1769.minOperations("001011");
        System.out.println(Arrays.toString(ints));
    }
}
