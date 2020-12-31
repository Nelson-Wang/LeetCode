package com;

/**
 * Created by wWX945273 on 2020/12/31.
 */
public class Solution824 {
    public boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c== 'i' || c== 'o' || c== 'u' || c == 'A' || c == 'E' || c== 'I' || c== 'O' || c== 'U'){
            return true;
        }
        return false;

    }
    public String toGoatLatin(String S) {
        String[] ss = S.split(" ");
        for (int i = 0; i < ss.length; i++){
            String sss = ss[i];
            if (!isVowel(sss.charAt(0))){
                String str = ss[i];
                ss[i] = str.substring(1) + str.substring(0 ,1);
            }
            ss[i] += "ma";
            char[] tmp = new char[i + 1];
            for (int j=0; j < tmp.length; j++){
                tmp[j] = 'a';
            }
            ss[i] += new String(tmp);
        }
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < ss.length; k++){
            //遍历出来的数据，用空号隔开
            if (k != ss.length - 1){
                ss[k] += " ";
            }
            sb.append(ss[k]);
        }
        return sb.toString();
    }
}
