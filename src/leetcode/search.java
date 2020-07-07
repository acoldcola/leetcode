package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/7/6 11:54
 * @Version 1.0
 *有一个M*N的矩阵，每个元素的值取自{1,2，3，…，MN}的集合，且互不相同。请设计一个程序，找出相邻数字的最长路径。
 * （相邻数字是指在此矩阵中上下左右位置相邻，并且值相差为1的数字。）
 * 例如：下图矩阵中相邻数字的最长链接路径为：1-2-3-4
 * 9	8	7
 * 5	6	4
 * 1	2	3
 */
public class search {
    public static int[][] res = new int[][] {{9,6,7},{7,5,4},{1,2,3}};
    int[] x = new int[] {1,-1,0,0};
    int[] y = new int[] {0,0,1,-1};
    boolean[][] flag;
    public int n;
    public int m;

    public static void main(String[] args) {
        search s = new search();
        System.out.println(s.sol(res));
    }
    public List<Integer> sol(int[][] res) {
        n = res.length;
        m = res[0].length;
        flag = new boolean[n][m];
        List<Integer> endList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                List<Integer> list = new ArrayList<>();
                List<Integer> list1 = dfs(i,j,res,list);
                if (list1.size() >= endList.size()) {
                    endList = list1;
                }
            }
        }
        return endList;
    }

    public List<Integer> dfs(int a, int b,int[][] res,List<Integer> list) {
        list.add(res[a][b]);
        if(flag[a][b]) {
            return list;
        }
        int nx,ny;
        for (int i = 0; i < 4;i++) {
            nx = a + x[i];
            ny = b + y[i];
            flag[a][b] = true;
            if (nx>=0 && nx < n && ny >= 0 && ny < m) {
                if (res[nx][ny] - res[a][b] == 1) {
                    List<Integer> list1 = dfs(nx,ny,res,list);
                    if (list1.size() > list.size()) {
                        list = list1;
                    }
                }
            }
        }
        flag[a][b] = false;
        return list;
    }
}
