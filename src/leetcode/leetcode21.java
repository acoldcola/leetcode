package leetcode;

import javax.xml.soap.Node;
import java.util.prefs.NodeChangeEvent;

/**
 * @auther ZhangKe
 * @date 2019/8/1 18:25
 * 合并两个有序链表
 */
public class leetcode21 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(1);
        ListNode node = head;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val) {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            } else {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            }
        }
        if (l1 == null) {
            node.next = l2;
        }else {
            node.next = l1;
        }
        return head.next;
    }
}
