package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/8/2 18:16
 * 环形链表
 */
public class leetcode141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode h1 = head;
        ListNode h2 = head;
        while (h2.next != null && h2.next.next != null) {
           h1 = h1.next;
           h2 = h2.next.next;
           if (h1 == h2) {
               return true;
           }
        }
        return false;
    }
}
