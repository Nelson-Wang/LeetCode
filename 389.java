package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wWX945273 on 2020/12/30.
 */
public class Solution389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (!smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i), 1);
            }else {
                smap.put(s.charAt(i), smap.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++){
            if (!tmap.containsKey(t.charAt(i))){
                tmap.put(t.charAt(i), 1);
            }else {
                tmap.put(t.charAt(i), tmap.get(t.charAt(i)) + 1);
            }
        }
        Set<Character> skeySet = smap.keySet();
        for (Character c: skeySet){
            if (!smap.get(c).equals(tmap.get(c))){
                return c;
            }
            tmap.remove(c);
        }

        Set<Character> tkeySet = tmap.keySet();
        Iterator<Character> iterator = tkeySet.iterator();
        return iterator.next();
    }

    public static void main(String[] args) {
        Solution389 solution389 = new Solution389();
        char theDifference = solution389.findTheDifference("abcd", "asdcb");
        System.out.println(theDifference);
    }
}
