package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/22.
 */
public class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i])+1);
            }
            if ((arrayList.isEmpty() || !arrayList.contains(nums[i])) && map.get(nums[i])>nums.length/3){
                arrayList.add(nums[i]);
            }
        }
        return arrayList;
    }
}
