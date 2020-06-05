package leetcode;

import javax.naming.InsufficientResourcesException;
import java.awt.*;

/**
 * @Author ZhangKe
 * @Date 2020/6/5 10:09
 * @Version 1.0
 * 顺时针打印矩阵
 */
public class interview29 {
    public static void main(String[] args) {
        interview29 l = new interview29();
        l.spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
    }
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int a = 0;
        int b = 0;
        int x = matrix.length - 1;
        int y = matrix[0].length - 1;
        int[] res = new int[(x+1)*(y+1)];
        int o = 0;
        for (int i = 0; i < (matrix.length + 1) / 2;i++) {
            a += i;
            b += i;
            x -= i;
            y -= i;
            for (int i1 = b; i1 <= y && o < res.length; i1++) {
                res[o++] = matrix[a][i1];
            }
            for (int i2 = a + 1; i2 <= x && o < res.length; i2++) {
                res[o++] = matrix[i2][y];
            }
            for (int i3 = y - 1; i3 >= b && o < res.length;  i3--) {
                res[o++] = matrix[x][i3];
            }
            for (int i4 = x - 1; i4 >= a + 1 && o < res.length;  i4--) {
                res[o++] = matrix[i4][b];
            }
        }
        return res;
    }
}
