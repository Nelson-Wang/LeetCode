package com;

/**
 * Created by wWX945273 on 2020/12/10.
 */
public class Solution338 {
    public int[] countBits(int num) {
        //f[i]:i的二进制表示中1的个数
        //初始数组
        int[] f = new int[num+1];
        //初始条件
        f[0] = 0;
        for (int i=1; i<num+1; i++){
            f[i] =  f[i>>1] + i%2;
        }
        return f;
    }
}
