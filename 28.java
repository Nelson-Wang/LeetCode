package com;

/**
 * Created by wWX945273 on 2020/11/17.
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0) return 0;
        if (haystack.length()==0 || !haystack.contains(needle)){
            return -1;
        }
        int i = 0, j = 0;
        while (i<haystack.length()){
            if (haystack.charAt(i) == needle.charAt(j)){
                j++;
                if (j==needle.length()) return i-j+1;
            }else {
                i = i-j;
                j=0;
            }

            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int i = solution28.strStr("hello", "ll");
        System.out.println(i);
    }
}
