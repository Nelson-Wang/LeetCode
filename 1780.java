package contest;

/**
 * Created by wWX945273 on 2021/3/8.
 */
public class Solution1780 {
    public boolean checkPowersOfThree(int n) {
        int consult = -1; //商
        int remain = 0; //余数
        while(consult != 0 && (remain == 0 || remain == 1)){
            consult = n / 3;
            remain = n % 3;
            n = consult;
        }
        if (remain == 0 || remain == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1780 solution1780 = new Solution1780();
        boolean b = solution1780.checkPowersOfThree(21);
        System.out.println(b);
    }
}
