package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/3 15:20
 * @Version 1.0
 * 数组中的最长山脉
 */
public class leetcode845 {
    public static void main(String[] args) {
        leetcode845 leetcode845 = new leetcode845();
        leetcode845.longestMountain(new int[] {2,2,2});
    }

    public int longestMountain(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }
        int[] a = new int[A.length];
        int[] b = new int[A.length];
        a[0] = 1;
        b[A.length - 1] = 1;
        for (int i = 1; i < A.length; i++) {
            a[i] = A[i] > A[i - 1] ? a[i - 1] + 1 : 1;
        }
        for (int i = A.length - 2; i >= 0; i--) {
            b[i] = A[i] > A[i + 1] ? b[i + 1] + 1 : 1;
        }
        int min = 0;
        for (int i = 0; i < A.length; i++) {
            if (a[i] == 1 || b[i] == 1){
                continue;
            }
            min = Math.max(min, a[i] + b[i]);
        }
        return (min - 1) >= 3 ? min - 1 : 0;
    }
}
