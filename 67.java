package com;


/**
 * Created by wWX945273 on 2021/3/1.
 */
public class Solution67 {
    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int length = i > j? i+1: j+1;
        int k = length;
        char[] chars = new char[length+1];
        while (i >= 0 || j >= 0){
            int x = 0;
            int y = 0;
            if (i >= 0){
                x = a.charAt(i)-48;
            }
            if (j >= 0){
                y = b.charAt(j)-48;
            }
            int sum = x + y + carry;
            if (sum >= 2){
                carry = 1;
                sum -= 2;
            }else {
                carry = 0;
            }
            chars[k] = (char)(sum + '0');
            i--;
            j--;
            k--;
            if (k == 0){
                if (carry != 0){
                    chars[k] = (char)(carry + '0');
                }else {
                    char[] chars1 = new char[length];
                    System.arraycopy(chars, 1, chars1, 0, length);
                    return new String(chars1);
                }

            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
        String s = solution67.addBinary("0", "0");
        System.out.println(s);
    }
}
