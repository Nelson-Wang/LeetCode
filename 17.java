package com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by wWX945273 on 2021/2/25.
 */
public class Solution17 {
    public String[] getMix(String[] olds, String[] news){
        int n1 = olds.length;
        int n2 = news.length;
        String[] strings = new String[n1 * n2];
        int k = 0;
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                strings[k] = olds[i] + news[j];
                k++;
            }
        }
        return strings;
    }

    public List<String> letterCombinations(String digits) {
        List<String> letterList = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return letterList;

        }
        HashMap<Character, String[]> map = new HashMap<>();
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});

        String[] olds = map.get(digits.charAt(0));
        String[] mix = new String[4*4*4*4];
        for (int i = 1; i < digits.length(); i++){
            String[] news = map.get(digits.charAt(i));
            mix = getMix(olds, news);
            olds = mix;
        }
        if (digits.length() == 1){
            return Arrays.asList(olds);
        }
        return Arrays.asList(mix);
    }
}
