package typeMoudle.stack;

/**
 * Created by wWX945273 on 2020/8/24.
 */

import java.util.ArrayDeque;

/**
 844. Backspace String Compare 退格字符串比较

 Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

 Example 1:

 Input: S = "ab#c", T = "ad#c"
 Output: true
 Explanation: Both S and T become "ac".
 Example 2:

 Input: S = "ab##", T = "c#d#"
 Output: true
 Explanation: Both S and T become "".
 Example 3:

 Input: S = "a##c", T = "#a#c"
 Output: true
 Explanation: Both S and T become "c".
 Example 4:

 Input: S = "a#c", T = "b"
 Output: false
 Explanation: S becomes "c" while T becomes "b".
 Note:

 1 <= S.length <= 200
 1 <= T.length <= 200
 S and T only contain lowercase letters and '#' characters.
 Follow up:

 Can you solve it in O(N) time and O(1)space?
 */

/**
 思路：使用stack，如果char不是退格符号，将其加入stack，否则从stack中取出，最后遍历两个stack，相同则返回true，否则返回false
 */
public class 退格字符串比较_844 {
    public static boolean backspaceCompare(String S, String T) {
        ArrayDeque sStack = backspaceDeal(S);
        ArrayDeque tStack = backspaceDeal(T);
        while (!sStack.isEmpty() && !tStack.isEmpty()){
            if (sStack.peek() != tStack.peek()){
                return false;
            }
            sStack.pop();
            tStack.pop();
        }
        return sStack.isEmpty() && tStack.isEmpty();
    }

    public static ArrayDeque backspaceDeal(String S){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i=0; i<S.length(); i++){
            if (S.charAt(i) != '#'){
                stack.push(S.charAt(i));
            }else {
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        String S = "a##c";
        String T = "#a#b";
        boolean res = backspaceCompare(S, T);
        System.out.println(res);
    }
}
