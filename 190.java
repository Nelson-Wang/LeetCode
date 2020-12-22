package com;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution190 {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++)
        {
            res<<=1;
            int end= n& 1; // store LSB
            res=res| end;
            n>>=1;
        }
        return res;
    }
}
