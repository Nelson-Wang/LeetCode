package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/24.
 */

/**
 234. Palindrome Linked List 回文链表

 Given a singly linked list, determine if it is a palindrome.

 Example 1:

 Input: 1->2
 Output: false
 Example 2:

 Input: 1->2->2->1
 Output: true
 Follow up:
 Could you do it in O(n) time and O(1) space?
 */

/**
 思路:可以在找到中点后，将后半段的链表翻转一下，这样我们就可以按照回文的顺序进行比较
 */
public class 回文链表_234 {
    public static boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        } 
        ListNode slow = head, fast = head, start = head;
        while (fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode pre = null;
        while (mid != null){
            ListNode next = mid.next;
            mid.next = pre;
            pre = mid;
            mid = next;
        }
        while (start != null && pre != null){
            if (start.val != pre.val){
                return false;
            }
            start = start.next;
            pre = pre.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}

