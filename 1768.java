package contest;

/**
 * Created by wWX945273 on 2021/3/9.
 */
public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        char[] chars = new char[len1 + len2];
        int i = 0, j = 0, k = 0;
        for (; k < len1 + len2; k++){
            if (i == len1){
                chars[k] = word2.charAt(j);
                j++;
            }else if (j == len2){
                chars[k] = word1.charAt(i);
                i++;
            }else {
                if (k % 2 == 0){
                    chars[k] = word1.charAt(i);
                    i++;
                }else {
                    chars[k] = word2.charAt(j);
                    j++;
                }
            }
        }
        return new String(chars);
    }

}
