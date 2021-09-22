package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/9/22 20:25
 * @Version 1.0
 * 分隔链表
 */
public class leetcode725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        ListNode[] res = new ListNode[k];
        int sum = size / k;
        int offset = size % k;
        int x = 0;
        for (int i = 0; i < k; i++) {
            p = head;
            if (x < offset) {
                for (int j = 0; j < sum; j++) {
                    p = p.next;
                }
                ListNode node = p.next;
                p.next = null;
                res[i] = head;
                head = node;
            }else {
                if (sum == 0) {
                    res[i] = null;
                } else {
                    for (int j = 0; j < sum; j++) {
                        p = p.next;
                    }
                    ListNode node = p.next;
                    p.next = null;
                    res[i] = head;
                    head = node;
                }
            }
        }
        return res;
    }
}
