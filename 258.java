package com;

/**
 * Created by wWX945273 on 2020/12/30.
 */
public class Solution258 {

    public int add(int num){
        int sum = 0;
        while (num > 0){
            int tmp = num % 10;
            sum += tmp;
            num /= 10;
        }
        return sum;
    }

    public int addDigits(int num) {
        while (num / 10 > 0){
             num = add(num);
        }
        return num;
    }
}
