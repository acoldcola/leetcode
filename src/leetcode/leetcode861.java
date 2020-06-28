package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/19 15:11
 * @Version 1.0
 * 翻转矩阵后的得分
 */
public class leetcode861 {
    public static void main(String[] args) {
        leetcode861 l = new leetcode861();
        l.matrixScore(new int[][] {{0,0,1,1},{1,0,1,0},{1,1,0,0}});
    }
    public int matrixScore(int[][] A) {
        if (A.length == 0 || A[0].length == 0) {
            return 0;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < A[0].length; j++) {
                    A[i][j] ^= 1;
                }
            }
        }
        for (int j = 1; j < A[0].length; j++) {
            int[] a = new int[2];
            for (int i = 0; i < A.length; i++) {
                if (A[i][j] == 0) {
                    a[0]++;
                }else {
                    a[1]++;
                }
            }
            if (a[0] > a[1]) {
                for (int i = 0; i < A.length; i++) {
                    A[i][j] ^= 1;
                }
            }
        }
        int sum = 0;
        int res = A[0].length - 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sum += A[i][j] << (res - j);
            }
        }
        return sum;
    }
}
