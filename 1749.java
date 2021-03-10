package contest;

/**
 * Created by wWX945273 on 2021/3/10.
 */
public class Solution1749 {
    public int maxAbsoluteSum(int[] nums) {
        int length = nums.length;
        //f[i]：以i结尾的最大值
        int[] f = new int[length];
        //d[i]：以i结尾的最小值
        int[] d = new int[length];
        f[0] = nums[0];
        d[0] = nums[0];
        for (int i = 1; i < length; i++){
            f[i] = Math.max(nums[i], f[i-1]+nums[i]);
            d[i] = Math.min(nums[i], d[i-1]+nums[i]);
        }
        int max = f[0];
        int min = d[0];
        for (int j = 1; j < length; j++){
            max = Math.max(f[j], max);
            min = Math.min(d[j], min);
        }
        return Math.max(Math.abs(max), Math.abs(min));
    }
}
