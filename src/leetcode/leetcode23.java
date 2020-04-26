package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author ZhangKe
 * @Date 2020/4/26 11:19
 * @Version 1.0
 * 合并K个排序链表
 */
public class leetcode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length < 1) {
            return null;
        }
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode listNode : lists) {
            if (listNode != null) {
                priorityQueue.add(listNode);
            }
        }
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();
            p.next = node;
            p = p.next;
            if (node.next != null) {
                priorityQueue.add(node.next);
            }
        }
        return head.next;
    }
}
