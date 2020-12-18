package com;

/**
 * Created by wWX945273 on 2020/12/18.
 * 3. Longest Substring Without Repeating Characters
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() ==0) return 0;
        int n = s.length();
        //f[i]:以s[i]结尾的最长不重复子串长度
        int[] f = new int[n];
        f[0] = 1;
        for (int i=1; i<n; i++){
            for (int j=i-1; j>=i-f[i-1]; j--){
                if (s.charAt(j)== s.charAt(i)){
                    f[i] = i-j;
                    break;
                }
            }
            if (f[i]==0) f[i] = f[i-1] + 1;

        }
        int max = f[0];
        for (int i=1; i<n; i++){
            max = Math.max(f[i], max);
        }
        return max;
    }
}
