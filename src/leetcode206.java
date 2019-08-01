/**
 * @auther ZhangKe
 * @date 2019/8/1 16:50
 * 反转一个单链表
 */
public class leetcode206 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    public ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }

    public ListNode reverse(ListNode pre, ListNode node) {
        if (node == null) {
            return pre;
        }
        ListNode node1 = node.next;
        node.next = pre;
        return reverse(node,node1);
    }
}