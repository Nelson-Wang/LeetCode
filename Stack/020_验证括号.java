package typeMoudle.stack;

/**
 * Created by wWX945273 on 2020/8/24.
 */

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 20. Valid Parentheses 验证括号

 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Note that an empty string is also considered valid.

 Example 1:

 Input: "()"
 Output: true
 Example 2:

 Input: "()[]{}"
 Output: true
 Example 3:

 Input: "(]"
 Output: false
 Example 4:

 Input: "([)]"
 Output: false
 Example 5:

 Input: "{[]}"
 Output: true
 */

/**
 思路：需要用一个栈，开始遍历输入字符串，如果当前字符为左半边括号时，则将其压入栈中，如果遇到右半边括号时，若此时栈为空，则直接
 返回 false，如不为空，则取出栈顶元素，若为对应的左半边括号，则继续循环，反之返回 false
 */
public class 验证括号_20 {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else {
                if (map.isEmpty()){
                    return false;
                } else if (map.get(s.charAt(i)) == stack.peek()){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[";
        System.out.println(isValid(s));

    }
}
