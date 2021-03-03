package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/2 10:49
 * @Version 1.0
 */
public class leetcode304 {
    static class NumMatrix {
        public static void main(String[] args) {
            NumMatrix numMatrix = new NumMatrix(new int[][] {{3, 0, 1, 4, 2},{5, 6, 3, 2, 1},{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},{1, 0, 3, 0, 5}});
            numMatrix.sumRegion(2, 1, 4, 3);
        }
        int[][] res;
        int[][] matrix;
        public NumMatrix(int[][] matrix) {
            this.matrix = matrix;
            if (matrix.length != 0 && matrix[0].length != 0) {
                res = new int[matrix.length][matrix[0].length + 1];
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 1 ; j < matrix[0].length + 1; j++) {
                        res[i][j] = res[i][j - 1] + matrix[i][j - 1];
                    }

                }
            }

        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int a = 0;
            for (int i = row1; i <= row2; i++) {
                a += res[i][col2+1] - res[i][col1];
            }
            return a;
        }
    }
}
