package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/12 23:54
 * @Version 1.0
 */
public class interview10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if (A[i] <= B[j]) {
                list.add(A[i++]);
            }else {
                list.add(B[j++]);
            }
        }
        while ( i < m) {
            list.add(A[i++]);
        }
        while (j < n) {
            list.add(B[j++]);
        }
        for (int i1 = 0; i1 < list.size(); i1++){
            A[i1] = list.get(i1);
        }
    }
}
