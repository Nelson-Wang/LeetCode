package com;

import java.util.HashMap;

/**
 * Created by wWX945273 on 2021/3/1.
 */
public class Solution12 {
    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        int[] divisors = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        while (num != 0){
            int remainder = num % divisors[i];
            int discuss = num / divisors[i];
            num = remainder;

            while (discuss > 0) {
                sb.append(map.get(divisors[i]));
                discuss--;
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        String s = solution12.intToRoman(18);
        System.out.println(s);
    }
}

