package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/29 17:57
 * @Version 1.0
 * N皇后
 */
public class leetcode51 {
    public static void main(String[] args) {
        leetcode51 leetcode51 = new leetcode51();
        leetcode51.solveNQueens(4);
    }
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        if (n == 0){
            return new ArrayList<>();
        }
        // 新建一个二维数组
        char[][] q = new char[n][n];
        boolean[][] used = new boolean[n][n];
        for (int i = 0; i < n;i++){
            for (int j = 0; j < n; j++) {
                q[i][j] = '.';
            }
        }
        List<String> list = new ArrayList<>();
        dfs(q,0,list);
        return res;
    }

    private void dfs(char[][] q,int i, List<String> list) {
        if (list.size() == q.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (i < 0 || i >= q[0].length){
            return;
        }
        for (int j = 0; j < q.length; j++){
            if(judge(q,i,j)){
                q[i][j] = 'Q';
                // 转换为字符串
                StringBuilder sb = new StringBuilder();
                for(int x = 0; x < q.length;x++){
                    sb.append(q[i][x]);
                }
                list.add(sb.toString());
                dfs(q,i+1,list);
                q[i][j] = '.';
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean judge(char[][] q,int i,int j){
        // 列判断
        for (int a = 0; a < q.length; a++){
            if(q[a][j] == 'Q'){
                return false;
            }
        }
        // 行判断
        for (int a = 0; a < q[0].length;a++){
            if(q[i][a] == 'Q'){
                return false;
            }
        }
        // 对角线1判断
        int x1 = i;
        int x2 = j;
        while (x1 > 0 && x2 > 0){
            if (q[--x1][--x2] == 'Q'){
                return false;
            }
        }
        x1 = i;
        x2 = j;
        while (x1 < q.length - 1 && x2 < q[0].length - 1){
            if (q[++x1][++x2] == 'Q'){
                return false;
            }
        }
        // 对角戏2判断
        int y1 = i;
        int y2 = j;
        while (y1 > 0 && y2 < q[0].length - 1){
            if (q[--y1][++y2] == 'Q'){
                return false;
            }
        }
        y1 = i;
        y2 = j;
        while (y1 < q.length - 1 && y2 > 0){
            if(q[++y1][--y2] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
