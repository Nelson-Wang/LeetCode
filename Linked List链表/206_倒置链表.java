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
 思路：使用递归法，不断的进入递归函数，直到head指向倒数第二个节点，因为head指向空或者是最后一个结点都直接返回了，newHead则指向对head的下一个结点调用递归函数返回的头结点，
 此时newHead指向最后一个结点，然后head的下一个结点的next指向head本身，这个相当于把head结点移动到末尾的操作，因为是回溯的操作，所以head的下一个结点总是在上一轮被移动到末尾
 了，但head之后的next还没有断开，所以可以顺势将head移动到末尾，再把next断开，最后返回newHead即可
 */
public class 倒置链表_206 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode reverse_head = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse_head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = reverseList(head);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
        System.out.println(res.next.next.next.val);
        System.out.println(res.next.next.next.next.val);
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
