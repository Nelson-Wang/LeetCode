package typeMoudle.binarySearch;

/**
 * Created by wWX945273 on 2020/8/19.
 */

/**
 367. Valid Perfect Square 检验完全平方数

 Given a positive integer num, write a function which returns True if num is a perfect square else False.

 Note: Do not use any built-in library function such as sqrt.

 Example 1:

 Input: 16
 Returns: True
 Example 2:

 Input: 14
 Returns: False
 */

/**
 思路：二分搜索法，查找mid * mid = num
 */
public class 检验完全平方数_367 {
    public static boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right){
            int mid = left + (right-left)/2;
            if ((long)mid * mid == num){
                return true;
            }else if ((long)mid * mid < num){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 49;
        System.out.println(isPerfectSquare(num));
    }
}
