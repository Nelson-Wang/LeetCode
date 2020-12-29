package com;

/**
 * Created by wWX945273 on 2020/12/29.
 */
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0){
            return true;
        }
        if (t == null || t.length() == 0){
            return false;
        }
        int index = 0;

        for (int i =0; i < s.length(); i++){
            boolean flag = false;
            while (index < t.length()){
                if (s.charAt(i) == t.charAt(index)){
                    flag = true;
                    index++;
                    break;
                }
                index++;
            }
            if (!flag){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution392 solution392 = new Solution392();
        boolean b = solution392.isSubsequence("aaaaaa", "bbaaaa");
        System.out.println(b);
    }
}
