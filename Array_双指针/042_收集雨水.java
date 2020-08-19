package module.双指针;

/**
 * Created by wWX945273 on 2020/8/18.
 */

/**
 42. Trapping Rain Water 收集雨水_42

 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

 The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

 Thanks Marcos for contributing this image!

 Example:

 Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 Output: 6
 */

/**
 思路：使用双指针的反向法，需要i和j两个指针分别指向数组的首尾位置，从两边向中间扫描，在当前两指针确定的范围内，先比较两头找出较小值，如果较小值是i指向的值，则从左

 向右扫描，如果较小值是j指向的值，则从右向左扫描，若遇到的值比当较小值小，则将差值存入结果，如遇到的值大，则重新确定新的窗口范围，以此类推直至i 和j指针重合
 */
public class 收集雨水_42 {
    public static int trap(int[] height) {
        if (height.length == 0){
            return 0;
        }
        int i = 0, j = height.length-1, level =0, res = 0;
        while (i < j){
            int lower = height[(height[i] < height[j]) ? i++ : j--];
            level = Math.max(level, lower);
            res += level - lower;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

}
