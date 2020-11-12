package com;

/**
 * Created by wWX945273 on 2020/11/12.
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        if (str.length()==0){
            return 0;
        }
        if (!str.contains(" ")){
            return str.length();
        }
        String[] split = str.split(" ");
        return split[split.length-1].length();
    }

    public static void main(String[] args) {
        Solution58 solution58 = new Solution58();
        String s = " ";
        int length = solution58.lengthOfLastWord(s);
        System.out.println(length);
    }
}
