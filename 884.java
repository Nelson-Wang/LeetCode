package com;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wWX945273 on 2020/12/29.
 */
public class Solution884 {
    public String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        if (A != null && A.length() != 0){
            String[] aa = A.split(" ");
            for (int i = 0; i < aa.length; i++){
                if (!map.containsKey(aa[i])){
                    map.put(aa[i], 1);
                }else {
                    map.put(aa[i], map.get(aa[i]) + 1);
                }
            }

        }
        if (B != null || B.length() != 0){
            String[] bb = B.split(" ");
            for (int i = 0; i < bb.length; i++){
                if (!map.containsKey(bb[i])){
                    map.put(bb[i], 1);
                }else {
                    map.put(bb[i], map.get(bb[i]) + 1);
                }
            }
        }

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (map.get(next) == 1){
                list.add(next);
            }
        }
        String[] arr = new String[list.size()];
        list.toArray(arr);
        return arr;
    }
}
