package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/2/22 22:58
 */
public class leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        int res = head.val;
        while (p.next != null) {
            ListNode node = p.next;
            if (node.val == res) {
                p.next = node.next;
            }else {
                p = p.next;
                res = node.val;
            }
        }
        return head;
    }
}
