package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2021/2/25.
 */
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++){
            List<Integer> now = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    now.add(1);
                }else {
                    now.add(pre.get(j-1) + pre.get(j));
                }
            }
            if (!pre.isEmpty()){
                pre.clear();
            }
            for (int k = 0; k < now.size(); k++){
                pre.add(now.get(k));
            }
            res = now;
        }
        return res;
    }
}
