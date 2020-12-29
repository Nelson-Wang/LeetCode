package com;

import java.util.Stack;

/**
 * Created by wWX945273 on 2020/12/29.
 */
public class Solution844 {
    public Stack<Character> backspaceDeal(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != '#'){
                stack.push(str.charAt(i));
            }else {
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        return stack;
    }
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = backspaceDeal(S);
        Stack<Character> tStack = backspaceDeal(T);
        return sStack.equals(tStack);
    }

    public static void main(String[] args) {
        Solution844 solution844 = new Solution844();
        boolean b = solution844.backspaceCompare("a#c", "b");
        System.out.println(b);
    }
}
