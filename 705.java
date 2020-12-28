package com;



/**
 * Created by wWX945273 on 2020/12/28.
 */
public class HashSet_705 {
    /** Initialize your data structure here. */
    boolean[] arr;
    public HashSet_705() {
        arr = new boolean[1000001];
    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key];
    }
}
