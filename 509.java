package com;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution509 {
    public int fib(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
}
