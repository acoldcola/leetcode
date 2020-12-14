package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/19 23:38
 * @Version 1.0
 * 二进制链表转整数
 */
public class leetcode1290 {
    public static void main(String[] args) {
        getDecimalValue(null);
    }
    public static int getDecimalValue(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = sum * 2 + head.val;
            head = head.next;
        }
        return sum;
    }
}
