package com;

/**
 * Created by wWX945273 on 2020/12/30.
 */
public class Solution507 {
    public boolean checkPerfectNumber(int num) {
        int sum = 0, divisor = 1;
        while (divisor <= num/2){
            if (num % divisor == 0){
                sum += divisor;
            }
            divisor++;
        }
        return sum == num;
    }
}
