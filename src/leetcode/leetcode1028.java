package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/6/18 11:11
 * @Version 1.0
 * 从先序遍历还原二叉树
 */
public class leetcode1028 {
    public static void main(String[] args) {
        leetcode1028 l = new leetcode1028();
        l.recoverFromPreorder("1-2--3--4-5--6--7");
    }
    public TreeNode recoverFromPreorder(String S) {
        if (S == null || "".equals(S)) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < S.length();) {
            int l = 0;
            while (S.charAt(i) == '-') {
                i++;
                l++;
            }
            int val = 0;
            while (i < S.length() && S.charAt(i) != '-') {
                val = val*10 + S.charAt(i) - '0';
                i++;
            }
            while (stack.size() > l) {
                stack.pop();
            }
            TreeNode node = new TreeNode(val);
            while (!stack.isEmpty()) {
                if (stack.peek().left == null) {
                    stack.peek().left = node;
                }else {
                    stack.peek().right =node;
                }
            }
            stack.push(node);
        }
        while (stack.size() > 1) {
            stack.pop();
        }
        return stack.pop();
    }
}
