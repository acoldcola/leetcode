package leetcode;

import com.sun.deploy.panel.ITreeNode;

/**
 * @Author ZhangKe
 * @Date 2020/8/26 10:24
 * @Version 1.0
 * 井字游戏
 */
public class interview16_04 {
    public static void main(String[] args) {
        interview16_04 i = new interview16_04();
        i.tictactoe(new String[] {"                             ","                     O       ","         X           X       ","                             ","                             ","                             ","                             ","                             ","                             ","                             ","                             ","                             ","                             ","                             ","                             ","                             ","                      O      ","                             ","                             ","                             ","                             ","                             ","                             ","      X                      ","                             ","                             ","      O                      ","                             ","                             "});
    }
    public String tictactoe(String[] board) {
        String res = "Draw";
        for (int i = 0; i < board.length; i++) {
            char x = board[i].charAt(0);
            boolean judge = true;
            if (x == ' '){
                judge = false;
                res = "Pending";
                continue;
            }
            for (int j = 1; j < board[0].length(); j++){
                if (x != board[i].charAt(j)) {
                    judge = false;
                }
                if (board[i].charAt(j) == ' ') {
                    judge = false;
                    res = "Pending";
                    break;
                }
            }
            if (judge) {
                res = String.valueOf(x);
                return res;
            }
        }
        for (int i = 0; i < board.length; i++) {
            char x = board[0].charAt(i);
            boolean judge = true;
            if (x == ' '){
                judge = false;
                res = "Pending";
                continue;
            }
            for (int j = 1; j < board[0].length(); j++){
                if (x != board[j].charAt(i)) {
                    judge = false;
                }
                if (board[j].charAt(i) == ' ') {
                    judge = false;
                    res = "Pending";
                    break;
                }
            }
            if (judge) {
                res = String.valueOf(x);
                return res;
            }
        }
        // 计算中间不用判断为空了
        char o = board[0].charAt(0);
        boolean judge1 = true;
        if (o == ' '){
            judge1 = false;
            res = "Pending";
        }else {
            for (int i = 1,j=1; i < board.length; i++, j++) {
                if (o != board[i].charAt(j)) {
                    judge1 = false;
                }
            }
        }
        if (judge1) {
            res = String.valueOf(o);
            return res;
        }
        char p = board[0].charAt(board[0].length() - 1);
        boolean judge2 = true;
        if (p == ' '){
            judge2 = false;
            res = "Pending";
        }else {
            int j = board.length - 2;
            for (int i = 1; i < board.length; i++) {
                if (p != board[i].charAt(j--)) {
                    judge2 = false;
                }
            }
        }
        if (judge2) {
            res = String.valueOf(p);
        }
        return res;
    }
}
