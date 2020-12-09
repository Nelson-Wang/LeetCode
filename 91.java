package com;

/**
 * Created by wWX945273 on 2020/12/9.
 */
public class Solution91 {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int[] f = new int[chars.length];
        //f[i]在数组i可以分开的方式数
        f[0] = chars[0]=='0'? 0: 1;
        for (int i=1; i<f.length; i++){
            if (chars[i]!='0'){
                f[i] += f[i-1];
            }

            int t = (chars[i-1]-'0') * 10 + chars[i]-'0';
            //两个前面没有字符
            if (i==1 && t>=10 && t<=26){
                f[i] += 1;
            }
            if (i>=2 && t>=10 && t<=26){
                f[i] += f[i-2];
            }
        }
        return f[f.length-1];
    }


    public static void main(String[] args) {
        Solution91 solution91 = new Solution91();
        String s = "12";
        System.out.println(solution91.numDecodings(s));
    }
}
