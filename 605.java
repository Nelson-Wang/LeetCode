package com;

/**
 * Created by wWX945273 on 2020/11/13.
 */
public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i;
        for (i=0; i<flowerbed.length-1; i++){
            if (i==0){
                if (flowerbed[i] == 0 &&flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        if (i== flowerbed.length-1){
            if (flowerbed[i-1] == 0 && flowerbed[i] == 0){
                flowerbed[i] = 1;
                count++;
            }
        }
        if (n==count){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,0};
        int n = 2;
        Solution605 solution605 = new Solution605();
        boolean flag = solution605.canPlaceFlowers(flowerbed, n);
        System.out.println(flag);
    }
}
