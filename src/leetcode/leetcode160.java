package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/8/12 14:43
 * 相交链表
 */
public class leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode x = headA;
        ListNode y = headB;
        while (x != y) {
            x = x == null ? headB : x.next;
            y = y == null ? headA : y.next;
        }
        return x;
    }
}