package com;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wWX945273 on 2020/12/18.
 */
public class Solution1048 {
    public boolean isStrChain(String s1, String s2){
        if (s1.length()+1!=s2.length()){
            return false;
        }
        int i=0, j=0;
        while (i<s1.length() && j<s2.length()){
            if (s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            j++;
        }
        if (i==s1.length()) return true;
        return false;
    }
    public int longestStrChain(String[] words) {
        //数组按长度进行排序
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(Arrays.toString(words));
        int n = words.length;
        //f[i]:记录词链最后一个词为已排序字符串数组第i个单词时，最长的词链长度
        int[] f = new int[n];
        //初始条件
        f[0] = 1;

        for (int i=1; i<n; i++){
            f[i] = 1;
            for (int j=0; j<i; j++){
                if (isStrChain(words[j], words[i])){
                    f[i] = Math.max(f[j]+1, f[i]);
                }
            }
        }
        int max = f[0];
        for (int i=1; i<n; i++){
            if (f[i]>max) max = f[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1048 solution1048 = new Solution1048();
        String[] wolds = {"ksqvsyq","ks","kss","czvh","zczpzvdhx","zczpzvh","zczpzvhx","zcpzvh","zczvh","gr","grukmj","ksqvsq","gruj","kssq","ksqsq","grukkmj","grukj","zczpzfvdhx","gru"};
        int i = solution1048.longestStrChain(wolds);
        System.out.println(i);
    }
}
