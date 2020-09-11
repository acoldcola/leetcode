package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/9/11 16:16
 * @Version 1.0
 * 单词替换
 */
public class leetcode648 {
    public static void main(String[] args) {
        leetcode648 l = new leetcode648();
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("bat");
        list.add("rat");
        l.replaceWords(list,"the cattle was rattled by the battery");
    }
    class TreeNode {
        boolean isEnd;
        TreeNode[] next = new TreeNode[26];
    }

    public TreeNode root = new TreeNode();

    public String replaceWords(List<String> dictionary, String sentence) {
        // 构建字典树
        for (String str : dictionary) {
            insert(str);
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb = search(strings[i]);
            if (sb == null || "".equals(sb)) {
                sb = new StringBuilder(strings[i]);
            }
            stringBuilder.append(sb + " ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

    public void insert(String word) {
        if (word == null) {
            return;
        }
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if (node.next[x - 'a'] == null) {
                node.next[x - 'a'] = new TreeNode();
            }
            node = node.next[x - 'a'];
        }
        node.isEnd = true;
    }

    public StringBuilder search(String word) {
        StringBuilder sb = new StringBuilder();
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if (node.next[x - 'a'] == null) {
                return null;
            }
            sb.append(x);
            node = node.next[x - 'a'];
            if (node.isEnd) {
                return sb;
            }
        }
        return null;
    }
}
