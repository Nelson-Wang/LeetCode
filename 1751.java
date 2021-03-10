package contest;

/**
 * Created by wWX945273 on 2021/3/10.
 */
public class Solution1750 {
    public int minimumLength(String s) {
        int length = s.length();
        int left = 0, right = length - 1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return right - left + 1;
            }
            while (left <= length-2 && right >= 0 && s.charAt(left) == s.charAt(left+1)){
                left++;
            }
            while (left <= length-1 && right >= 1 && s.charAt(right) == s.charAt(right-1)){
                right--;
            }
            left++;
            right--;
        }
        return left != right ? 0 : 1;
    }

    public static void main(String[] args) {
        Solution1750 solution1750 = new Solution1750();
        int i = solution1750.minimumLength("bbb");
        System.out.println(i);
    }
}
