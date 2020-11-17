package com;

/**
 * Created by wWX945273 on 2020/11/17.
 */
public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c: letters){
            if (c>target){
                return c;
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        Solution744 solution744 = new Solution744();
        char target = 'g';
        char c = solution744.nextGreatestLetter(letters, target);
        System.out.println(c);
    }

}
