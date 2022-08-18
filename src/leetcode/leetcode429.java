package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2022/8/18 23:29
 * @Version 1.0
 */
public class leetcode429 {
    public static void main(String[] args) {
        leetcode429 leetcode429 = new leetcode429();
        Node node = new Node();
        leetcode429.levelOrder(node);
    }
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res  =new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                list.add(node.val);
                if (node.children != null){
                    for (int j = 0; j < node.children.size(); j++) {
                        queue.add(node.children.get(j));
                    }
                }
            }
            res.add(list);
        }
        return res;
    }
}
