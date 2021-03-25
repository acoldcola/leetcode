package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther ZhangKe
 * @date 2019/2/22 22:29
 * 删除排序链表中的重复元素 II
 */
public class leetcode82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        Map<Integer, Integer> map = new HashMap<>();
        while (p != null) {
            map.put(p.val,map.getOrDefault(p.val,0) + 1);
            p = p.next;
        }
        while (head != null) {
            if (map.get(head.val) > 1) {
                head = head.next;
            }else {
                break;
            }
        }
        if (head == null) {
            return null;
        }
        p = head;
        while (p.next != null) {
            ListNode node = p.next;
            if (map.get(node.val) > 1) {
                p.next = node.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
