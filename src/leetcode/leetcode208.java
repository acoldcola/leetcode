package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/11 15:33
 * @Version 1.0
 * 实现前缀树
 */
public class leetcode208 {
    class TreeNode{
        boolean isEnd;
        TreeNode[] next = new TreeNode[26];
    }
    TreeNode root = null;
    /** Initialize your data structure here. */
    public leetcode208() {
        root = new TreeNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word == null){
            return;
        }
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++){
            char x = word.charAt(i);
            if (node.next[x - 'a'] == null){
                node.next[x - 'a'] = new TreeNode();
            }
            node = node.next[x - 'a'];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if (word == null){
            return false;
        }
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++){
            char x = word.charAt(i);
            if (node.next[x - 'a'] == null){
                return false;
            }
            node = node.next[x - 'a'];
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if (prefix == null){
            return false;
        }
        TreeNode node = root;
        for (int i = 0; i < prefix.length(); i++){
            char x = prefix.charAt(i);
            if (node.next[x - 'a'] == null){
                return false;
            }
            node = node.next[x - 'a'];
        }
        return true;
    }
}
