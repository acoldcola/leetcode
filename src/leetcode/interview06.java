package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/20 23:42
 * @Version 1.0
 * 从尾到头打印链表
 */
public class interview06 {
    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (head != null) {
            count++;
            head = head.next;
        }
        int[] num = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            num[i] = p.val;
            p = p.next;
        }
        return num;
    }
}
