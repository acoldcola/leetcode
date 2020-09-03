package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther ZhangKe
 * @date 2019/9/10 18:14
 * 删除链表的倒数第N个节点
 */
public class leetcode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode p = head;
        while (p != null){
            stack.push(p);
            p = p.next;
        }
        if (n > stack.size()) {
            return head;
        }
        ListNode oldNode = null;
        for (int i = 1; i <= stack.size(); i++) {
            if (i == n){
                stack.pop();
                while (stack.isEmpty()){
                    head.next = oldNode;
                }
                ListNode node = stack.peek();
                node.next = oldNode;
            }
            oldNode = stack.pop();
        }
        return head;
    }
}
