package com;

/**
 * Created by wWX945273 on 2020/12/14.
 */
public class Solution132 {
    public boolean isPalindrome(String s){
        if (s==null || s.length()==0) return false;
        if (s.length()==1) return true;
        int left = 0, right = s.length()-1;
        while (left <= right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int minCut(String s) {
        //f[i]:前i个字符(第i-1个)最少可以分为f[i]个字符串
        int n = s.length();
        int[] f = new int[n+1];
        f[0] = 0;
        for (int i=1; i<n+1; i++){
            f[i] = Integer.MAX_VALUE;
            for (int j=0; j<i; j++){
                if (isPalindrome(s.substring(j, i)) && f[j]!=Integer.MAX_VALUE){
                    f[i] = Math.min(f[j]+1, f[i]);
                }
            }
        }
        return f[n]-1;
    }

    public static void main(String[] args) {
        Solution132 solution132 = new Solution132();
        int aab = solution132.minCut("aab");
        System.out.println(aab);
    }
}
