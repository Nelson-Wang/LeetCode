package com;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if (n<=0) return false;
        if (n==1) return true;
        while (n!=1){
            if (n % 2!=0){
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
