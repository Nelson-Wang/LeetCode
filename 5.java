package com;

/**
 * Created by wWX945273 on 2020/12/17.
 * 5. Longest Palindromic Substring
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        char[] ss = s.toCharArray();
        int n= ss.length;
        if (n==1) return s;
        //f[i][j]:从i到j是否是回文串
        boolean[][] f = new boolean[n][n];
        int i0=-1;
        int j0=-1;
        for (int i=0; i<n; i++){
            f[i][i] = true;
            i0 = i;
            j0 = i;
        }
        for (int i=0; i<n-1; i++){
            f[i][i+1] = ss[i] == ss[i+1];
            if (ss[i] == ss[i+1]){
                i0 = i;
                j0 = i+1;
            }
        }

        int len;

        for (len=3; len<=n; len++){
            for (int i=0; i<=n-len; i++){
                int j = i+len-1;
                f[i][j] = false;
                if(f[i+1][j-1] && ss[i]==ss[j]){
                    f[i][j] = true;
                    i0 = i;
                    j0 = j;
                }
            }
        }
        if (i0!=-1 && j0!=-1) return s.substring(i0, j0+1);
        return null;
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        String cbbd = solution5.longestPalindrome("cbbd");
        System.out.println(cbbd);

    }
}
