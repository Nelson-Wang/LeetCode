package com;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by wWX945273 on 2020/12/18.
 * 409. Longest Palindrome
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i=0; i<n; i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        int sum = 0;
        boolean flag = false;
        Set<Character> keys = map.keySet();
        for (Character key: keys){
            if (map.get(key)%2 == 0){
                sum += map.get(key);
            }else {
                sum += map.get(key)-1;
                flag = true;
            }
        }
        if (flag){
            return sum+1;
        }
        return sum;
    }
}
