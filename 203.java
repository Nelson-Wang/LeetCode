package com;

/**
 * Created by wWX945273 on 2020/11/13.
 */

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        dummy.next = head;
        while (pre.next!=null){
            if (pre.next.val == val){
                ListNode t = pre.next;
                pre.next = t.next;
                t.next = null;
            }else {
                pre = pre.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution203 solution203 = new Solution203();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4= new ListNode(3);
        ListNode node5= new ListNode(4);
        ListNode node6= new ListNode(5);
        ListNode node7= new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode listNode = solution203.removeElements(node1, 6);

        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
