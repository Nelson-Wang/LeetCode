package lintcode;

/**
 * Created by wWX945273 on 2020/12/14.
 */
public class Solution394 {
    public boolean firstWillWin(int n){
        boolean[] f = new boolean[n+1];
        f[0] = false;
        f[1] = true;
        for (int i=2; i<n+1; i++){
            if (!f[i-1] || !f[i-2]){
                f[i] = true;
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        Solution394 solution394 = new Solution394();
        boolean b = solution394.firstWillWin(4);
        System.out.println(b);
    }
}
