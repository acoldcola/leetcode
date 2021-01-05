package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/1/4 11:04
 * @Version 1.0
 */
public class leetcode234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            node = node.next;
            list.add(node.val);
        }
        int left = 0;
        int right = list.size() -1;
        while (left <= right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
        }
        return true;
    }
}
