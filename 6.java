package com;

/**
 * Created by wWX945273 on 2021/2/27.
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        int length = s.length();
        char[][] chars = new char[numRows][length];
        int i = 0;
        int j = 0;
        int flag = 1;
        for (int k = 0; k < length; k++){
            chars[i][j] = s.charAt(k);
            if (flag == 1){
                if (i == numRows-1){
                    flag = -1;
                    i--;
                    j++;
                }else {
                    i++;
                }
            }else {
                if (i == 0){
                    flag = 1;
                    i++;
                }else {
                    i--;
                    j++;
                }
            }
        }

        char[] res = new char[length];
        int x = 0;
        for (int m = 0; m < numRows; m++){
            for (int n = 0; n < length; n++){
                if (chars[m][n] != '\u0000'){
                    res[x] = chars[m][n];
                    x++;
                }

            }
        }
        return new String(res);
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        String s = solution6.convert("PAYP,ALISHIRING", 3);
        System.out.println(s);


    }
}
