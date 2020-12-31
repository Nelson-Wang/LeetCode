package com;

/**
 * Created by wWX945273 on 2020/12/30.
 */
public class Solution520 {
    public boolean isUppercase(char c){
        if (c >= 'A' && c <='z'){
            return true;
        }
        return false;
    }

    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int upCount = 0;
        int lowCount = 0;
        for (int i = 1; i < n; i++){
            if (isUppercase(word.charAt(i))){
                upCount++;
            }else {
                lowCount++;
            }
        }
        if (isUppercase(word.charAt(0))){
            if (upCount == n - 1 || lowCount == n -1){
                return true;
            }
            return false;
        }else {
            if (lowCount == n-1){
                return true;
            }
            return false;
        }
    }
}
