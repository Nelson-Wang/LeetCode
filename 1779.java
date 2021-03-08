package contest;

/**
 * Created by wWX945273 on 2021/3/8.
 */
public class Solution1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++){
            if (points[i][0] == x || points[i][1] == y){
                int distance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (distance < minDistance){
                    minDistance = distance;
                    index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution1779 solution1779 = new Solution1779();
        int[][] distance = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        int i = solution1779.nearestValidPoint(3, 4, distance);
        System.out.println(i);
    }
}
