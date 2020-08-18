package module.双指针;

/**
 * Created by wWX945273 on 2020/8/18.
 */

/**
 344. Reverse String 翻转字符串_344

 Write a function that reverses a string. The input string is given as an array of characters char[].

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 You may assume all the characters consist of printable ascii characters.

 Example 1:

 Input: ["h","e","l","l","o"]
 Output: ["o","l","l","e","h"]
 Example 2:

 Input: ["H","a","n","n","a","h"]
 Output: ["h","a","n","n","a","H"]
 */

/**
 思路：使用双指针反向方法，i是左指针，j是右指针，从两头向中间移动，并交换arr[i]和arr[j]
 */
public class 翻转字符串_344 {
    public static char[] reserveString(char[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        System.out.println(reserveString(arr));
    }
}
