package com;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution342 {
    public boolean isPowerOfFour(int n) {
        if (n<=0) return false;
        if (n==1) return true;
        while (n!=1){
            if (n%4!=0) return false;
            n /= 4;
        }
        return true;
    }

}
