package contest;

/**
 * Created by wWX945273 on 2021/3/12.
 */
public class Solution1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int count = 1;
        for (int i = 0; i < rectangles.length; i++){
            int len = Math.min(rectangles[i][0], rectangles[i][1]);
            if (len > maxLen){
                maxLen = len;
                count = 1;
            }else if (len == maxLen){
                count++;
            }
        }
        return count;
    }
}
