package com;

/**
 * Created by wWX945273 on 2021/1/4.
 * 693. Binary Number with Alternating Bits
 */
public class Solution693 {

    public boolean hasAlternatingBits(int n) {
        int pre = -1;
        int now = -1;
        while (n > 0){
            now = n % 2;
            if (pre == now){
                return false;
            }
            pre = now;
            n >>= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution693 solution693 = new Solution693();
        boolean b = solution693.hasAlternatingBits(3);
        System.out.println(b);
    }
}
