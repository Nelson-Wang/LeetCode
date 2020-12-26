package com;

/**
 * Created by wWX945273 on 2020/12/26.
 */
public class Solution374 {
    int pick = 6;
    int guess(int num){
        if (num > pick){
            return -1;
        }else if (num < pick){
            return 1;
        }else {
            return 0;
        }
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (guess(mid) == 0){
                return mid;
            }else if (guess(mid) < 0){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution374 solution374 = new Solution374();
        int i = solution374.guessNumber(10);
        System.out.println(i);
    }
}
