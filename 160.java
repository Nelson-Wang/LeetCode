package com;

/**
 * Created by wWX945273 on 2020/11/16.
 */


public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != null || b != null) {
            if (a != null) {
                a = a.next;
            } else {
                headB = headB.next;
            }
            if (b != null) {
                b = b.next;
            } else {
                headA = headA.next;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
