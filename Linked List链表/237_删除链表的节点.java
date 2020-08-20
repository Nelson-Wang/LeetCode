package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/20.
 */

/**
 237. Delete Node in a Linked List 删除链表的节点

 Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

 Given linked list -- head = [4,5,1,9], which looks like following:

 Example 1:

 Input: head = [4,5,1,9], node = 5
 Output: [4,1,9]
 Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 Example 2:

 Input: head = [4,5,1,9], node = 1
 Output: [4,5,9]
 Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.

 Note:

 The linked list will have at least two elements.
 All of the nodes' values will be unique.
 The given node will not be the tail and it will always be a valid node of the linked list.
 Do not return anything from your function.
 */

/**
 思路：之前要删除一个节点的方法是要有其前一个节点的位置，然后将其前一个节点的next连向要删节点的下一个，然后delete掉要删的节点即可.
 这道题的处理方法是先把当前节点的值用下一个节点的值覆盖了，然后我们删除下一个节点即可
 */
public class 删除链表的节点_237 {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        deleteNode(head.next);
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
    }
}
