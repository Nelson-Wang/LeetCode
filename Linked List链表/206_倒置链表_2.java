package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/20.
 */

/**
 206. Reverse Linked List 倒置链表

 Reverse a singly linked list.

 Example:

 Input: 1->2->3->4->5->NULL
 Output: 5->4->3->2->1->NULL
 Follow up:

 A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

/**
 思路：使用迭代法，在原链表之前建立一个空的pre，将当年节点的下一个节点存为tmp，将当前节点的下一个节点指向pre，并更新当前节点为pre，更新head为tmp
 */
public class 倒置链表_206_2 {
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        ListNode res = reverseList(head);

        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
        System.out.println(res.next.next.next.val);
        System.out.println(res.next.next.next.next.val);
        System.out.println(res.next.next.next.next.next.val);
        System.out.println(res.next.next.next.next.next.next.val);
    }

}


