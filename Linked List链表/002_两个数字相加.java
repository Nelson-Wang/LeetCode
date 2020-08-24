package typeMoudle.linkedList;

/**
 * Created by wWX945273 on 2020/8/24.
 */

/**
 2. Add Two Numbers 两个数字相加

 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example:

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 */

/**
 思路：建立一个新链表，然后把输入的两个链表从头往后撸，每两个相加，添加一个新节点到新链表后面。while 循环的条件两个链表中只要有一个不为空行，由于链表可能为空，所以
 在取当前结点值的时候，先判断一下，若为空则取0，否则取结点值。然后把两个结点值相加，同时还要加上进位 carry。然后更新 carry，直接 sum/10 即可，然后以 sum%10 为值建
 立一个新结点，连到 cur 后面，然后 cur 移动到下一个结点。之后再更新两个结点，若存在，则指向下一个位置。while 循环退出之后，最高位的进位问题要最后特殊处理一下，若
 carry 为1，则再建一个值为1的结点
 */
public class 两个数字相加_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null){
            int d1 = l1 == null? 0: l1.val;
            int d2 = l2 == null? 0: l2.val;
            int sum = d1 + d2 + carry;
            carry = sum >= 10? 1: 0;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) cur.next = new ListNode(1);
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(8);
        head1.next.next = new ListNode(9);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        ListNode res = addTwoNumbers(head1, head2);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
