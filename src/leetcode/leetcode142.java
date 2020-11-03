package leetcode;

import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/10/10 10:43
 * @Version 1.0
 */
public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        boolean flag = false;
        ListNode a = head.next;
        ListNode b = head.next.next;
        while (a != null && b != null){
            if (a == b){
                flag = true;
                return a;
            }
            a = a.next;
            b = b.next.next;
        }
        return null;
    }
}
