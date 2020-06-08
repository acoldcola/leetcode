package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/2/21 16:31
 */
public class leetcode54 {
    public static void main(String[] args) {
        leetcode54 leetcode54 = new leetcode54();
        leetcode54.spiralOrder(new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        int a = 0;
        int b = 0;
        int x = matrix.length - 1;
        int y = matrix[0].length - 1;
        List<Integer> list = new ArrayList<>();
        int o = 0;
        int size = (x+1)*(y+1);
        for (int i = 0; i < (matrix.length + 1) / 2;i++) {
            if (i != 0) {
                a ++;
                b ++;
                x --;
                y --;
            }
            for (int i1 = b; i1 <= y && o < size; i1++) {
                list.add(matrix[a][i1]);
                o++;
            }
            for (int i2 = a + 1; i2 <= x && o < size; i2++) {
                list.add(matrix[i2][y]);
                o++;
            }
            for (int i3 = y - 1; i3 >= b && o < size;  i3--) {
                list.add(matrix[x][i3]);
                o++;
            }
            for (int i4 = x - 1; i4 >= a + 1 && o < size;  i4--) {
                list.add(matrix[i4][b]);
                o++;
            }
        }
        return list;
    }
}