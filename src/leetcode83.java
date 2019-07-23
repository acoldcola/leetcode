import java.util.HashSet;

/**
 * @auther ZhangKe
 * @date 2019/2/22 22:58
 */
public class leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head.next != null) {
            set.add(head);
            head = head.next;
        }
        return head;
    }
}
