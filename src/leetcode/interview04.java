package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/14 14:24
 * @Version 1.0
 * 二维数组中的查找
 */
public class interview04 {
    public static void main(String[] args) {
        interview04 i = new interview04();
        int[][] a = {{1,2,3},{1,2,3}};
        i.findNumberIn2DArray(a,45);
    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (n == 0 || m ==0) {
            return false;
        }
        int i = n-1;
        int j = 0;
        boolean x = false;
        while (i >=0 && j < m) {
            if (matrix[i][j] > target) {
                j++;
            }else if (matrix[i][j] < target) {
                i--;
            }else {
                x = true;
                break;
            }
        }
        return x;
    }
}
