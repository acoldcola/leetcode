package leetcode;

import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/9/10 18:17
 * @Version 1.0
 * 两数相加
 */
public class leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0;
        int i = 0;
        ListNode root = new ListNode(0);
        ListNode p = root;
        while (l1 != null || l2 != null || res > 0){
            if (l1 != null && l2 != null){
                p.next = new ListNode((l1.val + l2.val + res) % 10);
                p = p.next;
                res = (l1.val + l2.val + res) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 != null) {
                p.next = new ListNode((l1.val + res) % 10);
                p = p.next;
                res = (l1.val+ res) / 10;
                l1 = l1.next;
            }else if (l2 != null){
                p.next = new ListNode((l2.val + res) % 10);
                p = p.next;
                res = (l2.val + res) / 10;
                l2 = l2.next;
            }else {
                p.next = new ListNode(res);
                res /= 10;
            }
            i++;
        }
        return root.next;
    }
}
