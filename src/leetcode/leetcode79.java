package leetcode;

import org.omg.CORBA.INTERNAL;

/**
 * @Author ZhangKe
 * @Date 2020/9/13 7:43
 * @Version 1.0
 */
public class leetcode79 {
    public static void main(String[] args) {
        leetcode79 l = new leetcode79();
        l.exist(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"SEE");
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == word.charAt(0)){
                    if (dfs(i,j,board,used,word,sb,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, char[][] board, boolean[][] used, String word, StringBuilder sb,int path) {
        if (path == word.length()){
            return true;
        }
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1){
            return false;
        }
        if (board[i][j] != word.charAt(path)){
            return false;
        }
        if (used[i][j]){
            return false;
        }
        used[i][j] = true;
        boolean res =dfs(i + 1,j,board,used,word,sb,path + 1) ||
        dfs(i - 1,j,board,used,word,sb,path + 1) ||
        dfs(i,j + 1,board,used,word,sb,path + 1) ||
        dfs(i,j - 1,board,used,word,sb,path + 1);
        used[i][j] = false;
        return res;
    }
}
