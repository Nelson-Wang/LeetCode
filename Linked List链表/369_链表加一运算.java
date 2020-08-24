package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/24.
 */

/**
 369. Plus One Linked List 链表加一运算

 Given a non-negative integer represented as non-empty a singly linked list of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.

 Example :

 Input: [1,2,3]
 Output: [1,2,4]
 */

/**
 思路：先将原链表进行反转，然后将第一个节点的val值加1，如果val等于10，则将下一个节点的val的值加1，最后将链表反转输出即可
 */
public class 链表加一运算_369 {
    public static ListNode plusOne(ListNode head){
        ListNode reHead = reverse(head);
        ListNode startNode = reHead;
        reHead.val = reHead.val + 1;
        while (reHead != null){
            if (reHead.val == 10){
                reHead.val = 0;
                if (reHead.next == null){
                    reHead.next = new ListNode(1);
                    continue;
                }
                reHead.next.val = reHead.next.val + 1;
            }
            reHead = reHead.next;
        }
        ListNode resNode = reverse(startNode);
        return resNode;
    }

    public static ListNode reverse(ListNode head){
        ListNode pre = null;
        while (head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);
        ListNode res = plusOne(head);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
