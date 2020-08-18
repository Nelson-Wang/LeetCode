package module.双指针;

/**
 * Created by wWX945273 on 2020/8/17.
 */

/**
 26. Remove Duplicates from Sorted Array 有序数组中去除重复项

 Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 Example 1:

 Given nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

 It doesn't matter what you leave beyond the returned length.
 Example 2:

 Given nums = [0,0,1,1,1,2,2,3,3,4],

 Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

 It doesn't matter what values are set beyond the returned length.
 */

/**
 思路：使用双指针同向法，j指针遍历原数组，i指针作位为保留数组指针，当新元素与原数组元素不一样时，将该新元素复制到arr[i]位置，并

 将i++，否则则跳过不做处理
 */
public class 移除重复字符_26 {
    public static int removeDuplicates(int[] arr){
        int i = 0;
        int j = 0;
        while(j<arr.length){
            if(i==0 || arr[j] != arr[i-1]){
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(arr);
        System.out.println(length);
    }


}
