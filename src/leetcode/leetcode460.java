package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/9/24 22:14
 * @Version 1.0
 * 扁平化多级双向链表
 */

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
public class leetcode460 {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node node = head;
        Node prev = null;
        Stack<Node> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            if (node == null) {
                node = stack.pop();
                node.prev = prev;
                prev.next = node;
            }
            if (node.child != null) {
                if (node.next != null) {
                    stack.add(node.next);
                }
                node.next = node.child;
                node.child.prev = node;
                node.child = null;
            }
            prev = node;
            node = node.next;
        }
        return head;
    }
}
