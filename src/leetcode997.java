import java.util.*;

/**
 * @auther ZhangKe
 * @date 2019/2/1 10:28
 */
public class leetcode997 {
    public int[] sortedSquares(int[] A) {
        int a = A.length;
        int temp = 0;
        int[] b = new int[a];
        for(int i = 0; i < a; i++) {
            b[i] = A[i] * A[i];
        }
        Arrays.sort(b);
        return b;
    }
}
