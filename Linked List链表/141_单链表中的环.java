package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/20.
 */

/**
 141. Linked List Cycle 单链表中的环

 Given a linked list, determine if it has a cycle in it.

 To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list

 where tail connects to. If pos is -1, then there is no cycle in the linked list.

 Example 1:

 Input: head = [3,2,0,-4], pos = 1
 Output: true
 Explanation: There is a cycle in the linked list, where tail connects to the second node.

 Example 2:

 Input: head = [1,2], pos = 0
 Output: true
 Explanation: There is a cycle in the linked list, where tail connects to the first node.

 Example 3:

 Input: head = [1], pos = -1
 Output: false
 Explanation: There is no cycle in the linked list.

 Follow up:

 Can you solve it using O(1) (i.e. constant) memory?
 */

/**
 思路：使用快慢指针法，需要设两个指针，一个每次走一步的慢指针和一个每次走两步的快指针，如果链表里有环的话，两个指针最终肯定会相遇。
 */
public class 单链表中的环_141 {
    public static boolean hasCycle(ListNode head) {
        ListNode i = head, j = head;
        while (j != null && j.next != null){
            i = i.next;
            j = j.next.next;
            if (i == j){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head;
        System.out.println(hasCycle(head));
    }
}

