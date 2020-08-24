package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/21.
 */

/**
 83. Remove Duplicates from Sorted List 移除有序链表中的重复项

 Given a sorted linked list, delete all duplicates such that each element appear only once.

 Example 1:

 Input: 1->1->2
 Output: 1->2
 Example 2:

 Input: 1->1->2->3->3
 Output: 1->2->3
 */

/**
 遍历这个链表，每个结点和其后面的结点比较，如果结点值相同了，只要将前面结点的 next 指针跳过紧挨着的相同值的结点，指向后面一个结点。
 这样遍历下来，所有重复的结点都会被跳过，留下的链表就是没有重复项的
 */
public class 移除有序链表中的重复项_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null){
            while (cur != null && cur.next != null && cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(4);
        ListNode res = deleteDuplicates(head);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
        System.out.println(res.next.next.next.val);


    }
}
