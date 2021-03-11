package contest;

/**
 * Created by wWX945273 on 2021/3/11.
 */
public class Solution1732 {
    public int largestAltitude(int[] gain) {
        int length = gain.length;
        int[] ans = new int[length + 1];
        ans[0] = 0;
        for (int i = 0; i < length; i++){
            ans[i+1] = ans[i] + gain[i];
        }
        int max = 0;
        for (int i = 1; i < length + 1; i++){
            max = Math.max(ans[i], max);
        }
        return max;
    }
}
