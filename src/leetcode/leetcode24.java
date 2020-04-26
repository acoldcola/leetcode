package leetcode;

import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/26 15:50
 * @Version 1.0
 * 两两交换链表中的节点
 */
public class leetcode24 {
    public static void main(String[] args) {
        swapPairs(new ListNode(0));
    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head.next;
        head.next = swapPairs(p.next);
        p.next = head;
        return p;
    }
}