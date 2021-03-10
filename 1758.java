package contest;



/**
 * Created by wWX945273 on 2021/3/10.
 */
public class Solution1758 {
    public int minOperations(String s) {
        int count_1 = 0;
        int count_0 = 0;
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0 && s.charAt(i) == '0'){
                count_1++;
            }
            if (i % 2 == 1 && s.charAt(i) == '1'){
                count_1++;
            }
        }
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0 && s.charAt(i) == '1'){
                count_0++;
            }
            if (i % 2 == 1 && s.charAt(i) == '0'){
                count_0++;
            }
        }
        return Math.min(count_0, count_1);
    }

    public static void main(String[] args) {
        Solution1758 solution1758 = new Solution1758();
        int i = solution1758.minOperations("1111");
        System.out.println(i);
    }
}
