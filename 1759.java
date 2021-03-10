package contest;

/**
 * Created by wWX945273 on 2021/3/10.
 */
public class Solution1759 {

    public int countHomogenous(String s) {
        int length = s.length();
        int[] f = new int[length];
        f[0] = 1;
        int sum = 1;
        for (int i = 1; i < length; i++){
            if (s.charAt(i) == s.charAt(i-1)){
                f[i] = f[i-1] + 1;
            }else {
                f[i] = 1;
            }
            sum = (sum + f[i]) % 1000000007;
        }
        return sum;
    }

}
