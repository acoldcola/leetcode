package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/10 10:39
 * @Version 1.0
 */
public class leetcode5652 {
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode p = head;
        int a = 0;
        int b = 0;
        while (p.next != null) {
            size ++;
            if (size == k) {
                a = p.val;
                System.out.println(size + "-" +a);
            }
            p = p.next;
        }
        System.out.println(size);
        int size1 = 0;
        p = head;
        while (p.next != null) {
            size1 ++;
            if (size1 == size - k + 1) {
                 b = p.val;
                System.out.println(size1+ "-" +b);
            }
            p = p.next;
        }
        p = head;
        int size2 = 0;
        while (p.next != null) {
            size2 ++;
            if (size2 == k) {
                p.val = b;
            }
            if (size2 == size - k + 1) {
                p.val = a;
            }
            p = p.next;
        }
        return head;
    }
}
