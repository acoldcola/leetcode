package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/7/21 20:50
 * @Version 1.0
 * 矩阵中的路径
 */
public class offer12 {
    public static void main(String[] args) {
        offer12 offer12 = new offer12();
        char[][] board = {{'a', 'b'}};
        offer12.exist(board, "ba");
    }


    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) {
            return true;
        }
        char[] str = word.toCharArray();
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, used, i, j, str, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] used, int i, int i1, char[] str, Integer sd) {
        if (i < 0 || i > board.length - 1 || i1 < 0 || i1 > board[0].length - 1 || board[i][i1] != str[sd] || used[i][i1]) {
            return false;
        }
        if (sd == str.length - 1) {
            return true;
        }
        used[i][i1] = true;
        boolean res = dfs(board, used, i + 1, i1, str, sd + 1) || dfs(board, used, i - 1, i1, str, sd + 1) || dfs(board, used, i, i1 + 1, str, sd + 1) || dfs(board, used, i, i1 - 1, str, sd + 1);
        used[i][i1] = false;
        return res;
    }

}
