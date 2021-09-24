package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/13 17:28
 * @Version 1.0
 * N叉树的前序遍历
 */

class Node2 {
    public int val;
    public List<Node2> children;

    public Node2() {}

    public Node2(int _val) {
        val = _val;
    }

    public Node2(int _val, List<Node2> _children) {
        val = _val;
        children = _children;
    }
};

public class leetcode589 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node2 root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        for (Node2 node : root.children) {
            preorder(node);
        }
        return list;
    }
}
