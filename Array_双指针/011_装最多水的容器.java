package module.双指针;

/**
 * Created by wWX945273 on 2020/8/18.
 */

/**
 11. Container With Most Water 装最多水的容器_11

 Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints

 of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

 Note: You may not slant the container and nis at least 2.


 The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

 Example:

 Input: [1,8,6,2,5,4,8,3,7]
 Output: 49
 */

/**
 思路：使用双指针反向法，定义i和j两个指针分别指向数组的左右两端，然后两个指针向中间搜索，移动y值较小的指针，每移动一次算一个值

 和结果比较取较大的，容器装水量的算法是找出左右两个边缘中较小的那个乘以两边缘的距离
 */
public class 装最多水的容器_11 {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int maxCapacity = (height[i]<height[j]?height[i]:height[j]) * (j-i);
        while (i < j){
            int ly = height[i];
            int ry = height[j];
            int capacity = (ly<ry?ly:ry) * (j-i);
            if (capacity>maxCapacity){
                maxCapacity = capacity;
            }
            if(ly<ry){
                i++;
            }else {
                j--;
            }
        }
        return maxCapacity;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
