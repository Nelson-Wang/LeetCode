package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/21.
 */

/**
 143. Reorder List 链表重排序

 Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 You may not modify the values in the list's nodes, only nodes itself may be changed.

 Example 1:

 Given 1->2->3->4, reorder it to 1->4->2->3.
 Example 2:

 Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 */

/**
 思路：这道链表重排序问题可以拆分为以下三个小问题：

 1. 使用快慢指针来找到链表的中点，并将链表从中点处断开，形成两个独立的链表。

 2. 将第二个链翻转。

 3. 将第二个链表的元素间隔地插入第一个链表中
 */
public class 链表重排序_143 {
    public static void reorderList(ListNode head) {
        if (head == null){
            return;
        }
        //查找中点
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midHead = slow.next;
        slow.next = null;

        //反转中点后的链
        ListNode pre = null;
        while (midHead != null){
            ListNode next = midHead.next;
            midHead.next = pre;
            pre = midHead;
            midHead = next;
        }

        //将第二个链表的元素间隔地插入第一个链表中
        while(head != null && pre != null){
            ListNode next = head.next;
            head.next = pre;
            pre = pre.next;
            head.next.next = next;
            head = next;
        }
        return;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        reorderList(head);
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
        System.out.println(head.next.next.next.next.val);
        System.out.println(head.next.next.next.next.next.val);
        System.out.println(head.next.next.next.next.next.next.val);
    }
}
