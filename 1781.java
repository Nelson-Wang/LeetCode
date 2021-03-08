package contest;

/**
 * Created by wWX945273 on 2021/3/8.
 */
public class Solution1781 {
    //获取此时chars数组的beauty
    public int countBeauty(int[] chars){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i: chars){
            if (i != 0){
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
        }
        return max - min;
    }

    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            //每次子串重新起头时创建数组
            int[] chars = new int[26];
            for (int j = i; j < s.length(); j++){
                char c = s.charAt(j);
                chars[c-'a']++;
                sum += countBeauty(chars);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution1781 solution1781 = new Solution1781();
        int a = solution1781.beautySum("a");
        System.out.println(a);
    }

}
