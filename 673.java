package com;


/**
 * Created by wWX945273 on 2020/12/11.
 */
public class Solution673 {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        //以nums[i]结尾的子序列,nums[i][0]:最大长度，nums[i][1]：最大长度出现次数
        int[][] f = new int[n][2];
        f[0][0] = 1;
        f[0][1] = 1;
        int totalMax = 1;
        int totalCount = 1;

        for (int i=1; i<n; i++){
            int currentMax = 1;
            int currentCount = 1;

            for (int j=0; j<i; j++){
                f[i][0] = 1;
                if (nums[i]>nums[j]){
                    int tempMax = f[j][0] + 1;
                    if (tempMax == currentMax){
                        currentCount += f[j][1];
                    }
                    if (tempMax>currentMax){
                        currentMax = tempMax;
                        currentCount = f[j][1];
                    }
                }
            }
            f[i][0] = currentMax;
            f[i][1] = currentCount;

            if (totalMax == currentMax){
                totalCount += currentCount;
            }else if (totalMax < currentMax){
                totalMax = currentMax;
                totalCount = currentCount;
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        Solution673 solution673 = new Solution673();
        int[] nums = {1,3,5,4,7};
        int numberOfLIS = solution673.findNumberOfLIS(nums);
        System.out.println(numberOfLIS);
    }
}
