package com;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by wWX945273 on 2020/12/28.
 * 295. Find Median from Data Stream
 */
public class MedianFinder_295 {
    ArrayList<Integer> list;
    double median;
    /** initialize your data structure here. */
    public MedianFinder_295() {
        list = new ArrayList<>();
        median = -1;
    }

    public void addNum(int num) {
        list.add(num);
    }

    public double findMedian() {
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int length = list.size();
        if (length == 0) return -1;
        if (length % 2 == 1){
            median = list.get(length / 2);
        }else {
            median = ((double)list.get(length / 2) + (double)list.get(length / 2 - 1)) / 2;
        }
        return median;
    }
}
