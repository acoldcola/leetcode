package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/2/20 13:41
 * @Version 1.0
 * 统计有序矩阵中的负数
 */
public class leetcode1351 {
    public static void main(String[] args) {
        int a[][] ={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int x = countNegatives(a);
    }
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i = grid.length;
        int j = 0;
        while (i <1) {

        }
        return  (m-i)*(m-i);
    }
}
