package typeMoudle.binarySearch;

/**
 * Created by wWX945273 on 2020/8/19.
 */

/**
 441. Arranging Coins 排列硬币

 You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

 Given n, find the total number of full staircase rows that can be formed.

 n is a non-negative integer and fits within the range of a 32-bit signed integer.

 Example 1:

 n = 5

 The coins can form the following rows:
 ¤
 ¤ ¤
 ¤ ¤

 Because the 3rd row is incomplete, we return 2.
 Example 2:

 n = 8

 The coins can form the following rows:
 ¤
 ¤ ¤
 ¤ ¤ ¤
 ¤ ¤

 Because the 4th row is incomplete, we return 3.
 */

/**
 思路：使用二分搜索法，判断中间值的(mid*(mid-1))与n的大小，(mid*(mid-1))>n时，缩小区间的右侧，(mid*(mid-1))<n时，缩小区间的左侧，直到left=right返回left
 */
public class 排列硬币_441 {
    public static int arrangeCoins(int n) {
        int left = 1, right = n;
        while (left < right){
            int mid = left + (right-left+1)/2;
            if ((mid * (mid+1))/2 == n){
                return mid;
            }else if ((mid * (mid+1))/2 > n){
                right = mid -1;
            }else {
                left = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(arrangeCoins(n));
    }
}
