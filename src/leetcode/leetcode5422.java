package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/13 22:35
 * @Version 1.0
 */
public class leetcode5422 {
    private int[][] a;
    public leetcode5422(int[][] rectangle) {
        a = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                a[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        if (a.length == 0 || a[0].length == 0) {
            return 0;
        }
        if (row >= a.length || row < 0 || col >= a[0].length || col < 0) {
            return 0;
        }
        return a[row][col];
    }
}
