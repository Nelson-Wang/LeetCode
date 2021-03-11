package contest;

/**
 * Created by wWX945273 on 2021/3/11.
 */
public class Solution1742 {
    public int countSum(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int countBalls(int lowLimit, int highLimit) {
        int[] box = new int[10000];
        for (int i = lowLimit; i <= highLimit; i++){
            int sum = countSum(i);
            box[sum]++;
        }
        int max = box[0];
        for (int i = 1; i < box.length; i++){
            max = Math.max(max, box[i]);
        }
        return max;
    }
}
