package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2020/6/18 18:15
 * @Version 1.0
 * 矩阵置零
 */
public class leetcode73 {
    public static void main(String[] args) {
        leetcode73 leetcode73 = new leetcode73();
        leetcode73.setZeroes(new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (Integer r : row) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[r][j] = 0;
            }
        }
        for (Integer l : col) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][l] = 0;
            }
        }
        return;
    }
}
