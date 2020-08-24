package typeMoudle.双指针;

/**
 * Created by wWX945273 on 2020/8/20.
 */

/**
 125. Valid Palindrome 验证回文字符串

 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 */

/**
 思路：使用双指针法，需要建立两个指针，left和right, 分别从字符的开头和结尾处开始遍历整个字符串，如果遇到非字母数字的字符就跳过，继续往下找，
 直到找到下一个字母数字或者结束遍历，如果遇到大写字母，就将其转为小写。等左右指针都找到字母数字时，比较这两个字符，若相等，则继续比较下面两
 个分别找到的字母数字，若不相等，直接返回false
 */
public class 验证回文字符串_125 {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while (left < right){
            if (!isNumAlph(s.charAt(left))){
                left++;
                continue;
            }
            if (!isNumAlph(s.charAt(right))){
                right--;
                continue;
            }
            if (!isEqual(s.charAt(left), s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isNumAlph(char c){
        int num = (int)c;
        if (num >= 48 && num <= 57 || num >= 65 && num <= 90 || num >= 97 && num <= 122){
            return true;
        }
        return false;
    }

    public static boolean isEqual(char c1, char c2){
        String s1 = Character.toString(c1);
        String s2 = Character.toString(c2);
        return s1.equalsIgnoreCase(s2);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
