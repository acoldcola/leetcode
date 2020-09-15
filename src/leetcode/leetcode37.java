package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/15 14:43
 * @Version 1.0
 * 解决数独
 */
public class leetcode37 {
    public void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[board.length][board.length + 1];
        boolean[][] cal = new boolean[board.length][board.length + 1];
        boolean[][][] cr = new boolean[board.length][board[0].length][board.length + 1];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] != '.'){
                    // 初始化布尔数组
                    row[i][board[i][j] - '0'] = true;
                    cal[j][board[i][j] - '0'] = true;
                    cr[i/3][j/3][board[i][j] - '0'] = true;
                }
            }
        }
        dfs(row,cal,cr,board,0,0);
    }

    private boolean dfs(boolean[][] row, boolean[][] cal, boolean[][][] cr, char[][] board, int i, int j) {
        if (j == board[0].length){
            j = 0;
            i++;
            if (i == board.length){
                return true;
            }
        }
        if (board[i][j] == '.'){
            for (int num = 1; num <= 9; num++){
                boolean res = row[i][num] || cal[j][num] || cr[i/3][j/3][num];
                if (!res){
                    board[i][j] = (char) (num + '0');
                    row[i][num] = true;
                    cal[j][num] = true;
                    cr[i/3][j/3][num] = true;
                    if (dfs(row,cal,cr,board,i,j+1)){
                        return true;
                    }
                    board[i][j] = '.';
                    row[i][num] = false;
                    cal[j][num] = false;
                    cr[i/3][j/3][num] = false;
                }
            }
        }
        else {
            return dfs(row,cal,cr,board,i,j+1);
        }
        return false;
    }
}
