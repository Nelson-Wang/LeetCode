package com;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        if (n<=0) return false;
        if (n==1) return true;
        while (n!=1){
            if (n%3!=0) return false;
            n /= 3;
        }
        return true;
    }
}
