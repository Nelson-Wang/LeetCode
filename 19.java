package com;



/**
 * Created by wWX945273 on 2021/2/27.
 */
public class Solution19 {
    //删除倒数第n个节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        for (int i = 1; i <= n + 1; i++){
            fast = fast.next;
        }
        ListNode slow = dummy;
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;


        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Solution19 solution19 = new Solution19();
        ListNode node = solution19.removeNthFromEnd(node1, 2);
        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);
        System.out.println(node.next.next.next.val);
    }
}
