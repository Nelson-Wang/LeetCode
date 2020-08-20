package typeMoudle.binarySearch;

/**
 * Created by wWX945273 on 2020/8/20.
 */

/**
 374. Guess Number Higher or Lower 猜数字大小

 We are playing the Guess Game. The game is as follows:

 I pick a number from 1 to n. You have to guess which number I picked.

 Every time you guess wrong, I'll tell you whether the number is higher or lower.

 You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

 -1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
 Example:

 n = 10, I pick 6.

 Return 6.
 */
public class 猜数字大小_374 {
    public static int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (mid == n){
                return mid;
            }else if (mid < n){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(guessNumber(n));
    }


}
