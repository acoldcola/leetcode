package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/7/21 12:50
 * @Version 1.0
 * 两个链表的第一个公共节点
 */
public class offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a != null || b != null) {
            if (a == null) {
                a = headB;
            }
            if (b == null) {
                b = headA;
            }
            if (a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;

    }
}
