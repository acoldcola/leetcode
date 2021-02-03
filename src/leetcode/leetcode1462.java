package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/2/3 16:11
 * @Version 1.0
 * 课程表 IV
 */
public class leetcode1462 {
    public static void main(String[] args) {
        leetcode1462 l = new leetcode1462();
        l.checkIfPrerequisite(5,new int[][]{{0,1},{1,2},{2,3},{3,4}},new int[][] {{0,4},{4,0},{1,3},{3,0}});
    }
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        boolean[][] a = new boolean[n][n];
        for (int i = 0; i < prerequisites.length; i++) {
            a[prerequisites[i][0]][prerequisites[i][1]] = true;
        }
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (a[i][k] && a[k][j]) {
                        a[i][j] = true;
                    }
                }
            }
        }
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            res.add(a[queries[i][0]][queries[i][1]]);
        }
        return res;
    }
}