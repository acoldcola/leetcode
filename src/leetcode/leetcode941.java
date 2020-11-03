package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/11/3 9:59
 * @Version 1.0
 * 有效的山脉数组
 */
public class leetcode941 {
    public boolean validMountainArray(int[] A) {
        boolean flag = true;
        int size = 0;
        for (int i = 0; i < A.length - 1; i++){
            if (A[i] == A[i + 1]){
                return false;
            }
            if (flag){
                if (A[i] > A[i + 1]){
                    if (i == 0){
                        return false;
                    }
                    flag = false;
                    size ++;
                }
            }else {
                if (A[i] < A[i + 1]) {
                    flag = true;
                    size ++;
                }
            }
        }
        return size == 1;
    }
}
