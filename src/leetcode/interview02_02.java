package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/20 9:59
 * @Version 1.0
 */
public class interview02_02 {
    public int kthToLast(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return k > list.size() ? 0: list.get(list.size() - k);
    }
}
