package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/9/24 22:14
 * @Version 1.0
 * 扁平化多级双向链表
 */

class Node6 {
    public int val;
    public Node6 prev;
    public Node6 next;
    public Node6 child;
};
public class leetcode460 {
    public Node6 flatten(Node6 head) {
        if (head == null) {
            return null;
        }
        Node6 Node6 = head;
        Node6 prev = null;
        Stack<Node6> stack = new Stack<>();
        while (Node6 != null || !stack.isEmpty()) {
            if (Node6 == null) {
                Node6 = stack.pop();
                Node6.prev = prev;
                prev.next = Node6;
            }
            if (Node6.child != null) {
                if (Node6.next != null) {
                    stack.add(Node6.next);
                }
                Node6.next = Node6.child;
                Node6.child.prev = Node6;
                Node6.child = null;
            }
            prev = Node6;
            Node6 = Node6.next;
        }
        return head;
    }
}
