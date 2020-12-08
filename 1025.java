package com;

/**
 * Created by wWX945273 on 2020/12/8.
 */
public class Solution1025 {
    public boolean divisorGame(int N) {
        //f[i]：i当前回合玩家能都否获胜
        //f[i] = or(!f[i-x])   1<=x<i && i%x==0
        boolean[] f = new boolean[N+1];

        f[1] = false;
        for (int i=2; i<N+1; i++){
            for (int j=1; j<i; j++){
                if(i%j==0){
                    f[i] = !f[i-j];
                }
                //有一个f[i-x]为false即可
                if (f[i]){
                    break;
                }
            }
        }
        return f[N];
    }
}
