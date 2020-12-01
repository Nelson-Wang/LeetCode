package com;

/**
 * Created by wWX945273 on 2020/11/28.
 */
/**
 * Input: S = "5F3Z-2e-9-w", K = 4
 * Output: "5F3Z-2E9W"
 */
public class Solution434 {
    public int countSegments(String s) {
        String str = s.trim();
        if (str.length()==0) return 0;
        String[] strings = str.split("\\s{1,}");
        return strings.length;
    }
    public static void main(String[] args) {
        String s = "a  s ";
        Solution434 solution482 = new Solution434();
        System.out.println(solution482.countSegments(s));
    }
}
