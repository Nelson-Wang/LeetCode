package learn;
import java.util.*;
/**
 * Created by wWX945273 on 2020/11/6.
 */

/**
 [LeetCode] 925. Long Pressed Name 长按键入的名字

 Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

 You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 Example 1:

 Input: name = "alex", typed = "aaleex"
 Output: true
 Explanation: 'a' and 'e' in 'alex' were long pressed.
 Example 2:

 Input: name = "saeed", typed = "ssaaedd"
 Output: false
 Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
 Example 3:

 Input: name = "leelee", typed = "lleeelee"
 Output: true
 Example 4:

 Input: name = "laiden", typed = "laiden"
 Output: true
 Explanation: It's not necessary to long press any character.
 Note:

 name.length <= 1000
 typed.length <= 1000
 The characters of name and typed are lowercase letters.
 */

/**
 思路：使用字典存取，key对应字符的索引，value对应字符出现的次数，得到nameMap和typedMap，比较两个map，先比较map长度是否相同，若
 不相同返回false，再比较map中对应的字符是否相同，如不相同返回false，最后比较字符出现的次数，nameMap的字符次数要小于等于typedMap
 的字符次数，否则返回false
 */
public class Solution925 {
    public HashMap<Integer, Integer> strtranslateList(String str){
        int pre = 0;
        int after = 1;
        int count = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (after<str.length()){
            if(str.charAt(after) == str.charAt(pre)){
                count++;
            }else {
                map.put(pre, count);
                pre = after;
                count = 1;
            }
            after++;
        }
        map.put(pre, count);
        return map;
    }
    public boolean isLongPressedName(String name, String typed) {
        HashMap<Integer, Integer> nameMap = strtranslateList(name);
        HashMap<Integer, Integer> typedMap = strtranslateList(typed);
        System.out.println(nameMap);
        System.out.println(typedMap);
        if (nameMap.size() != typedMap.size()){
            return false;
        }
        int index1 = 0, index2 = 0;
        while (index1<name.length() && index2<typed.length()){
            int value1 = nameMap.get(index1);
            int value2 = typedMap.get(index2);
            if (name.charAt(index1) != typed.charAt(index2) || value1>value2){
                return false;
            }
            index1 += value1;
            index2 += value2;
        }
        System.out.println(index1);
        System.out.println(index2);
        return true;
    }

    public static void main(String[] args) {
        String name = "alexddd";
        String typed = "aaleexddd";
        Solution925 solution925 = new Solution925();
        boolean flag = solution925.isLongPressedName(name, typed);
        System.out.println(flag);
    }
}
