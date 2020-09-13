package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2020/9/12 9:54
 * @Version 1.0
 * 单词搜索 II
 */
public class leetcode212 {
    public static void main(String[] args) {
        leetcode212 l = new leetcode212();
        l.findWords(new char[][]{{'a','b'},{'a','a'}},new String[]{"aba","baa","bab","aaab","aaa","aaaa","aaba"});
    }
    class TreeNode{
    boolean isEnd;
    TreeNode[] next = new TreeNode[26];
}
    public int[][] c = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public TreeNode root = new TreeNode();
    public List<String> list = new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        if (board.length == 0){
            return list;
        }
        for (String str : words) {
            insert(str);
        }
        boolean[][] used = new boolean[board.length][board[0].length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                dfs(i,j,board,used,sb,root);
            }
        }
        return list;
    }

    private void dfs(int i, int j,char[][] board, boolean[][] used, StringBuilder sb, TreeNode root) {
        if (root.isEnd){
            list.add(sb.toString());
            // 这一步很关键防止重复单词出现
            root.isEnd = false;
        }
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1){
            return;
        }
        if (used[i][j]){
            return;
        }
        if (root.next[board[i][j] - 'a'] == null){
            return;
        }
        sb.append(board[i][j]);
        root = root.next[board[i][j] - 'a'];
        used[i][j] = true;
        for (int x = 0; x < 4; x ++){
            int a = i + c[x][0];
            int b = j + c[x][1];
            dfs(a,b,board,used,sb,root);
        }
        used[i][j] = false;
        sb.deleteCharAt(sb.length() - 1);
    }

    public void insert(String str){
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
        node.isEnd = true;
    }
}

