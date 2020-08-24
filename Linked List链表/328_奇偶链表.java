package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/24.
 */

/**
 328. Odd Even Linked List 奇偶链表

 Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

 You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

 Example:
 Given 1->2->3->4->5->NULL,
 return 1->3->5->2->4->NULL.

 Note:
 The relative order inside both the even and odd groups should remain as it was in the input.
 The first node is considered odd, the second node even and so on ...

 Credits:
 Special thanks to @aadarshjajodia for adding this problem and creating all test cases.
 */

/**
 思路：用两个奇偶指针分别指向奇偶节点的起始位置，另外需要一个单独的指针even_head来保存偶节点的起点位置，然后把奇节点的指向偶节点的下一个(一定是奇节点)，
 此奇节点后移一步，再把偶节点指向下一个奇节点的下一个(一定是偶节点)，此偶节点后移一步，以此类推直至末尾，此时把分开的偶节点的链表连在奇节点的链表后即可
 */
public class 奇偶链表_328 {
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = head, even = head.next, even_head = even;
        while (even != null && even.next != null){
            odd = odd.next = even.next;
            even = even.next = odd.next;
        }
        odd.next = even_head;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = oddEvenList(head);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
        System.out.println(res.next.next.next.val);
        System.out.println(res.next.next.next.next.val);

    }
}
