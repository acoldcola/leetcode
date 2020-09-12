package leetcode;


/**
 * @Author ZhangKe
 * @Date 2020/9/11 18:11
 * @Version 1.0
 */
public class leetcode676 {
    class TreeNode{
        boolean isEnd;
        TreeNode[] next = new TreeNode[26];
    }
    public TreeNode root;
    public leetcode676() {
        root = new TreeNode();
    }

    public void buildDict(String[] dictionary) {
        for (String str : dictionary) {
            insert(str);
        }
    }

    private void insert(String str) {
        if (str == null){
            return;
        }
        TreeNode node = root;
        for (int i = 0; i < str.length(); i++){
            char x = str.charAt(i);
            if (node.next[x - 'a'] == null){
                node.next[x - 'a'] = new TreeNode();
            }
            node = node.next[x - 'a'];
        }
    }

    public boolean search(String searchWord) {
        if (searchWord == null){
            return false;
        }
        TreeNode node = root;
        int sum = 0;
        for (int i = 0; i < searchWord.length(); i++){
            char x = searchWord.charAt(i);
            if (node.next[x - 'a'] == null){

            }
        }
        return false;
    }
}

