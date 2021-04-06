package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/3/27 22:01
 * @Version 1.0
 */
public class leetcode61 {
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        if (list.size() == 0) {
            return null;
        }
        ListNode node = new ListNode(0);
        return null;
    }
}
