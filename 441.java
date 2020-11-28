package com;

/**
 * Created by wWX945273 on 2020/11/20.
 */
public class Solution441 {
    public int arrangeCoins(int n) {
        int i=1, count=0;
        long sum = 0;
        while(sum<=n){
            sum += i;
            count++;
            i++;
        }
        return count-1;
    }

    public static void main(String[] args) {
        Solution441 solution441 = new Solution441();
        int i = solution441.arrangeCoins(2147483647);
        System.out.println(i);
    }
}
