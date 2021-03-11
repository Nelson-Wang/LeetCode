package contest;

import java.util.Arrays;

/**
 * Created by wWX945273 on 2021/3/11.
 */
public class Solution1753 {
    public int maximumScore(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        int min = nums[0];
        int mid = nums[1];
        int max = nums[2];
        int score = 0;
        if (min + mid <= max){
            score = min + mid;
        }else {
            score = (min + mid + max) / 2;
        }
        return score;
    }
}
