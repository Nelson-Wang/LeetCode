package typeMoudle.stack;

/**
 * Created by wWX945273 on 2020/8/25.
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 739. Daily Temperatures 日常温度

 Given a list of daily temperatures, produce a list that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

 For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].

 Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
 */
public class 日常温度_739 {
    public static int[] dailyTemperatures(int[] T) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[T.length];
        for (int i=T.length-1; i>=0; i--){
            while (!stack.isEmpty() && T[i]>=T[stack.peek()]){
                stack.pop();
            }
            res[i] = stack.isEmpty()? 0: stack.peek()-i;
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures = dailyTemperatures(T);
        System.out.println(Arrays.toString(temperatures));
    }
}
