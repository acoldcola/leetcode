package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/7/25 16:48
 * 搜索二维矩阵
 */
public class leetcode74 {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1){
            return false;
        }
        int[] a;
        if (matrix.length == 0 || matrix[0].length == 0) {
             a = new int[matrix.length + matrix[0].length];
        }else {
             a = new int[matrix.length * matrix[0].length];
        }
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                a[x++] = matrix[i][j];
            }
        }
        int l = 0;
        int h = a.length - 1;
        while (h  >= l) {
            int mid = (h+l)/2;
            if(a[mid] > target) {
                h = mid - 1;
            }else if (a[mid] < target) {
                l = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
