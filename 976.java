package com;

import java.util.Arrays;

/**
 * Created by wWX945273 on 2021/2/25.
 */
public class Solution976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        for (int i = n - 1; i >= 3; i--){
            if (A[i] < A[i-1] + A[i-2]){
                return A[i] + A[i-1] + A[i-2];
            }
        }
        return 0;
    }
}
