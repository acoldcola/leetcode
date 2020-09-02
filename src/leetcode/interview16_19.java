package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/9/2 17:34
 * @Version 1.0
 * 水域大小
 */
public class interview16_19 {
    public static void main(String[] args) {
        interview16_19 i = new interview16_19();
        i.pondSizes(new int[][]{{0,2,1,0},{0,1,0,1},{1,1,0,1},{0,1,0,1}});
    }
    List<Integer> list = new ArrayList<>();
    int sum = 0;
    int[][] x = new int[][] {{-1,-1},{0,-1},{1,-1},{-1,0},{1,0},{-1,1},{0,1},{1,1}};
    public int[] pondSizes(int[][] land) {
        boolean[][] used = new boolean[land.length][land[0].length];
        for (int i = 0; i < land.length; i++){
            for (int j = 0; j < land[0].length; j++) {
                if(land[i][j] == 0) {
                    dfs(i,j,used,land);
                    if (sum > 0) {
                        list.add(sum);
                    }
                    sum = 0;
                }
            }
        }
        int[] res = new int[list.size()];
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private void dfs(int i, int j, boolean[][] used, int[][] land) {
        if (land[i][j] != 0 || used[i][j]){
            return;
        }
        sum++;
        used[i][j] = true;
        for (int q = 0; q < x.length; q++){
            int a = i + x[q][0];
            int b = j + x[q][1];
            if (a >= 0 && a < land.length && b >= 0 && b < land[0].length){
                dfs(a,b,used,land);
            }
        }
    }
}
