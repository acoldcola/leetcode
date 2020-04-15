package leetcode;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/4/15 9:23
 * @Version 1.0
 * 01矩阵
 */
public class leetcode524 {
    public static void main(String[] args) {
        leetcode524 leetcode524 = new leetcode524();
        int[][] matrix = {{0,0,0},{0,1,0},{0,0,0}};
        leetcode524.updateMatrix(matrix);
    }
    public int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    matrix[i][j] = -1;
                }
            }
        }
        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int m = point[0] + x[i];
                int n = point[1] + y[i];
                if (m >= 0 && m < matrix.length && n >= 0
                        && n < matrix[0].length && matrix[m][n] == -1){
                    matrix[m][n] = matrix[point[0]][point[1]] + 1;
                    queue.offer(new int[] {m,n});
                }
            }
        }
        return matrix;
    }
}
