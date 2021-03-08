package contest;

/**
 * Created by wWX945273 on 2021/3/8.
 */
public class Solution1784 {
    public boolean checkOnesSegment(String s) {
        boolean flag_0 = false;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0'){
                flag_0 = true;
            }
            if (flag_0 && s.charAt(i) == '1'){
                return false;
            }
        }
        return true;
    }

}
