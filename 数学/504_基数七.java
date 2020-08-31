package typeMoudle.数学;

/**
 * Created by wWX945273 on 2020/8/31.
 */


import java.util.ArrayList;
import java.util.List;

/**
 504. Base 7 基数七

 Given an integer, return its base 7 string representation.

 Example 1:

 Input: 100
 Output: "202"

 Example 2:

 Input: -7
 Output: "-10"

 Note: The input will be in range of [-1e7, 1e7].
 */
public class 基数七_504 {
    public static String convertToBase7(int num) {
        List<Integer> remainders = new ArrayList<>();
        String res = "";
        while (num > 0){
            int remainder = num % 7;
            remainders.add(remainder);
            num = num / 7;
        }
        for (int j=remainders.size()-1; j>=0; j--){
            res += Integer.toString(remainders.get(j));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(8));
    }

}
