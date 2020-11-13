package com;

/**
 * Created by wWX945273 on 2020/11/13.
 */
public class Solution263 {
    public boolean isUgly(int num) {
        if (num==0) return false;
        int[] flags = {2,3,5};
        for (int i=0; i<flags.length; i++){
            while (num % flags[i]==0){
                num /= flags[i];
            }
            if (num == 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution263 solution263 = new Solution263();
        int num = -5;
        boolean ugly = solution263.isUgly(num);
        System.out.println(ugly);
    }
}
