package com;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wWX945273 on 2020/12/11.
 */
public class Solution354 {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        if(n==0) return 0;

        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]){
                    return o1[1] - o2[1];
                }else {
                    return o1[0] - o2[0];
                }
            }
        });

        //f[i]:以a[i]结尾的信封最多可以套信封的个数
        int[] f = new int[n];

        for (int i=0; i<n; i++){
            f[i] = 1;
            for (int j=0; j<i; j++){
                if (envelopes[j][0]<envelopes[i][0] && envelopes[j][1]<envelopes[i][1]){
                    f[i] = Math.max(f[i], f[j]+1);
                }
            }
        }
        int max = f[0];
        for (int i=1; i<n; i++){
            if (f[i]>max) max = f[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Solution354 solution354 = new Solution354();
        int[][] envelopes = {{5,4},{6,4},{6,7},{2,3}};
        int i = solution354.maxEnvelopes(envelopes);
        System.out.println(i);
    }
}
