package contest;

/**
 * Created by wWX945273 on 2021/3/9.
 */
public class Solution1763 {
    public boolean isBeauty(int[] chars){
        for (int i = 0; i < 26; i++){
            if (chars[i] == 0 && chars[i+32] != 0 || chars[i] != 0 && chars[i+32] == 0){
                return false;
            }
        }
        return true;
    }
    public String longestNiceSubstring(String s) {
        int len = 0;
        int start = -1;
        int end = -1;

        int length = s.length();
        for (int i = 0; i < length; i++){
            int[] chars = new int[32+26+26];
            for (int j = i; j < length; j++){
                char c = s.charAt(j);
                chars[c-'A']++;
                if (isBeauty(chars)){
                    if (j-i+1 > len){
                        len = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        if (start == -1){
            return "";
        }
        return s.substring(start, end+1);
    }
}
