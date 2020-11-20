package com;

/**
 * Created by wWX945273 on 2020/11/19.
 */
public class Solution1290 {
    public int getDecimalValue(ListNode head) {
        int sum = head.val;
        ListNode next = head.next;
        while (next!=null){
            sum = sum * 2 + next.val;
            next = next.next;
        }
        return sum;
    }
}
