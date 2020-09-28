package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/9/25 18:21
 * @Version 1.0
 *  区间列表的交集
 */
public class leetcode986 {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0;
        int j = 0;
        List<int[]> lists = new ArrayList<>();
        while (i < A.length && j < B.length){
            if (B[j][1] >= A[i][0] && A[i][1] >= B[j][0]){
                lists.add(new int[] {Math.max(A[i][0],B[j][0]),Math.min(A[i][1],B[j][1])});
            }
            if (B[j][1] > A[i][1]){
                i++;
            }else {
                j++;
            }
        }
        int[][] a = new int[lists.size()][2];
        return lists.toArray(a);
    }
}
