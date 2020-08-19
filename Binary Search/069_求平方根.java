package typeMoudle.binarySearch;

/**
 * Created by wWX945273 on 2020/8/19.
 */

/**
 69. Sqrt(x) 求平方根

 Implement int sqrt(int x).

 Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

 Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

 Example 1:

 Input: 4
 Output: 2
 Example 2:

 Input: 8
 Output: 2
 Explanation: The square root of 8 is 2.82842..., and since
 the decimal part is truncated, 2 is returned.
 */

/**
 使用二分法，查找出最接近sqrt(x)结果的值，如果满足则返回mid,否则在退出循环后得到[left, right](left<target<right),返回left
 */
public class 求平方根_69 {
    public static int mySqrt(int x) {
        int left = 0, right = x;
        while (left < right-1){
            int mid = left + (right-left)/2;
            if (mid * mid == x){
                return mid;
            }else if (mid * mid > x){
                right = mid;
            }else {
                left = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int x = 80;
        System.out.println(mySqrt(x));
    }
}
