package contest;

/**
 * Created by wWX945273 on 2021/3/12.
 */
public class Solution1736 {
    public String maximumTime(String time) {
        char[] chars = time.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[0] == '?'){
                if (chars[1] <'4' && chars[1] == '?'){
                    chars[0] = '2';
                }else {
                    chars[0] = '1';
                }
            }
            if (chars[1] == '?'){
                if (chars[0] != '2'){
                    chars[1] = '9';
                }else {
                    chars[1] = '3';
                }
            }
            if (chars[3] == '?'){
                chars[3] = '5';
            }
            if (chars[4] == '?'){
                chars[4] = '9';
            }
        }
        return new String(chars);
    }
}
