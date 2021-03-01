package com;



/**
 * Created by wWX945273 on 2021/3/1.
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while (l1 != null || l2 != null){
            if (l1 == null){
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            } else if (l2 == null){
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            }else {
                if (l1.val < l2.val){
                    pre.next = l1;
                    pre = pre.next;
                    l1 = l1.next;
                }else {
                    pre.next = l2;
                    pre = pre.next;
                    l2 = l2.next;
                }
            }
        }
        return dummy.next;
    }
}
