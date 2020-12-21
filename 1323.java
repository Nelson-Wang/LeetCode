package com;


/**
 * Created by wWX945273 on 2020/12/21.
 */
public class Solution1323 {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        int max = num;
        char[] chars = s.toCharArray();
        for (int i=0; i<s.length(); i++){
            if (chars[i]=='6'){
                chars[i] = '9';
                String tmpStr = new String(chars);
                int tmpNum = Integer.parseInt(tmpStr);
                if (tmpNum>max) max = tmpNum;
                chars[i] = '6';
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1323 solution1323 = new Solution1323();
        int i = solution1323.maximum69Number(6969);
        System.out.println(i);
    }
}
