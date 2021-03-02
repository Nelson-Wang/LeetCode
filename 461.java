package typeMoudle.bitCompute;

/**
 * Created by wWX945273 on 2021/3/2.
 */
public class 汉明距离_461 {
    public int hammingDistance(int x, int y) {
        int ans = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++){
            if ((ans & (1 << i)) != 0){
                count++;
            }
        }
        return count;
    }
}
