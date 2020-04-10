package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/10 17:07
 * @Version 1.0
 * 旋转矩阵
 */
public class interview01_07 {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
        List<Integer> list = new ArrayList<>();
        for (int j = 0;j < m; j++) {
            for (int i = n; i >= 0; i--){
                list.add(matrix[i][j]);
            }
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = list.get(x++);
            }
        }
    }
}
