package com;

import java.util.HashMap;

/**
 * Created by wWX945273 on 2020/12/29.
 */
public class Solution792_2 {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i =0; i < s.length(); i++){
            boolean flag = false;
            while (index < t.length()){
                if (s.charAt(i) == t.charAt(index)){
                    flag = true;
                    index++;
                    break;
                }
                index++;
            }
            if (!flag){
                return false;
            }
        }
        return true;
    }
    public int numMatchingSubseq(String S, String[] words) {
        HashMap<String, Boolean> map = new HashMap<>();
        int count = 0;
        for (String word: words){
            if (!map.containsKey(word)){
                if (isSubsequence(word, S)){
                    map.put(word, true);
                    count++;
                }
            }else {
                count++;
            }
        }
        return count;
    }
}
