package learn;

/**
 * Created by wWX945273 on 2020/10/12.
 */
public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int sum = 0;
        for (int i=0; i<length; i++){
            for (int j=0; j<length; j++){
                if (i==j){
                    sum += mat[i][j];
                }
            }
        }
        for (int m=length-1; m>=0; m--){
            for (int n=0; n<length; n++){
                if (m+n==length-1){
                    if (m==n){
                        continue;
                    }
                    sum += mat[m][n];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] mat = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        Solution1572 solution1572 = new Solution1572();
        System.out.println(solution1572.diagonalSum(mat));
    }
}
