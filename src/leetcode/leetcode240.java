package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/8 15:10
 * @Version 1.0
 * 搜索二维矩阵 II
 */
public class leetcode240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (target > matrix[i][j]) {
                j++;
            }else if(target < matrix[i][j]) {
                i--;
            }else {
                return true;
            }
        }
        return false;
    }
}
