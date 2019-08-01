package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/2/22 22:29
 */
public class leetcode82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode h = head;
        while (h.next != null) {
            if (h.val == h.next.val) {
                h = h.next.next;
            }
            h = h.next;
        }
        return head;
    }
}
