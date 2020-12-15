package lintcode;

/**
 * Created by wWX945273 on 2020/12/15.
 */
public class Solution0 {
    public int backPack(int target, int[]A){
        //f[i]:组合成i的方式数,最后一部，有A[0]..A[n-1]种选择
        int n = A.length;
        int[] f = new int[target+1];
        //pai[i]:如果方式数大于等于1，最后一个数字数可以是pai[i]
        //target  pai[target]   pai[target-pai[target]]
        int[] pai = new int[target+1];
        f[0] = 1;
        for (int i=1; i<target+1; i++){
            for (int j=0; j<n; j++){
                if (i>=A[j]){
                    f[i] += f[i-A[j]];

                    if (f[i-A[j]]>0){
                        //有一种方式
                        pai[i] = A[j];
                    }
                }
            }
        }

        if (f[target]>0){
            int i = target;
            System.out.print(i + " = ");
            while (i!=0){
                if (i!=target){
                    System.out.print(" + ");
                }
                System.out.print(pai[i]);
                i -= pai[i];
            }
            System.out.println();
        }

        return f[target];
    }

    public static void main(String[] args) {
        Solution0 solution0 = new Solution0();
        int[] A= {1,2,4};
        int i = solution0.backPack(10, A);
        System.out.println(i);
    }

}
