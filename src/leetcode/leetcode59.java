package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/11/4 14:08
 * @Version 1.0
 */
public class leetcode59 {
    public static void main(String[] args) {
        generateMatrix(1);
    }
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int sum = 1;
        int i = 0;
        int j = 0;
        while (i <= (n-1)/2) {
            int a = i;
            int b = j;
            while (b <= n - 1 - j) {
                res[a][b++] = sum++;
            }
            b --;
            a ++;
            while (a <= n - 1 - i) {
                res[a++][b] = sum++;
            }
            a --;
            b --;
            while (b >= j) {
                res[a][b--] = sum++;
            }
            b ++;
            a --;
            while (a > i) {
                res[a--][b] = sum++;
            }
            i++;
            j++;
        }
        return res;
    }
}
