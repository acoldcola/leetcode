package 竞赛.第44场双周赛;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/1/24 11:25
 * @Version 1.0
 */
public class add3 {
    public static void main(String[] args) {
        kthLargestValue(new int[][]{{5,2},{1,6}},1);
    }
    public static int kthLargestValue(int[][] matrix, int k) {
        int[][] a = new int[matrix.length][matrix[0].length];
        a[0][0] = matrix[0][0];
        List<Integer> list = new ArrayList<>();
        list.add(a[0][0]);
        for (int i = 1; i < matrix.length; i++) {
            a[i][0] = a[i-1][0] ^ matrix[i][0];
            list.add(a[i][0]);
        }
        for (int j = 1; j < matrix[0].length; j++) {
            a[0][j] = a[0][j-1] ^ matrix[0][j];
            list.add(a[0][j]);
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                a[i][j] = a[i-1][j] ^ a[i][j - 1] ^ a[i-1][j-1] ^ matrix[i][j];
                list.add(a[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-k);
    }
}
