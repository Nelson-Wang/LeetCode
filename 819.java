package com;


import java.util.*;

/**
 * Created by wWX945273 on 2020/12/31.
 * 819. Most Common Word
 */
public class Solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String lowerCase = paragraph.toLowerCase();

        String l = lowerCase.replaceAll("[^a-z]", " ");
        String[] ss = l.split(" ");

        System.out.println(Arrays.toString(ss));
        for (int i = 0; i < banned.length; i++){
            set.add(banned[i]);

        }
        for (int i = 0; i < ss.length; i++){
            if (set.contains(ss[i])){
                continue;
            }
            if (ss[i].equals("")){
                continue;
            }

            if (!map.containsKey(ss[i])){
                map.put(ss[i], 1);
            }else {
                map.put(ss[i], map.get(ss[i]) + 1);
            }
        }
        System.out.println(map.toString());
        Set<String> keySet = map.keySet();
        int max = 0;
        String str = "";
        for (String s : keySet){
            if (map.get(s) > max){
                max = map.get(s);
                str = s;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Solution819 solution819 = new Solution819();
        String[] strings = {"hit"};
        String s = solution819.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", strings);
        System.out.println(s);
    }
}
