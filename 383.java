package com;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by wWX945273 on 2020/12/30.
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0){
            return true;
        }
        if (magazine == null || magazine.length() == 0){
            return false;
        }

        HashMap<Character, Integer> rmap = new HashMap<>();
        HashMap<Character, Integer> mmap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++){
            if (!rmap.containsKey(ransomNote.charAt(i))){
                rmap.put(ransomNote.charAt(i), 1);
            }else {
                rmap.put(ransomNote.charAt(i), rmap.get(ransomNote.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < magazine.length(); i++){
            if (!mmap.containsKey(magazine.charAt(i))){
                mmap.put(magazine.charAt(i), 1);
            }else {
                mmap.put(magazine.charAt(i), mmap.get(magazine.charAt(i)) + 1);
            }
        }
        Set<Character> skeySet = rmap.keySet();
        for (Character c: skeySet){
            if (!mmap.containsKey(c) || mmap.get(c) < rmap.get(c)){
                return false;
            }
        }
        return true;
    }
}
