package com;

/**
 * Created by wWX945273 on 2021/3/2.
 */
/**
 * 异或运算作用：
 *
 　　（1） 0^0=0，0^1=1 0异或任何数＝任何数

 　　（2） 1^0=1，1^1=0 1异或任何数＝任何数取反

 　　（3） 任何数异或自己＝把自己置0
 */
public class Solution476 {
    public int findComplement(int num) {

        //first finding index of last set bit form the right
        //从右边开始查最后一个1
        int i = 0, index = 0;
        for(i = 0; i < 32; i++)
        {
            if((num & (1 << i)) != 0)
                index = i;
        }

        //异或预算（^），相同为0，不同为1
        for(int j = 0; j <= index; j++)
            num ^= (1 << j);

        return num ;
    }
}
