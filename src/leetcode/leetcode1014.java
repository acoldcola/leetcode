package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/17 9:30
 * @Version 1.0
 * 最佳观光组合
 */
public class leetcode1014 {
    public static void main(String[] args) {
        leetcode1014 l = new leetcode1014();
        l.maxScoreSightseeingPair(new int[] {8,1,5,2,6});
    }
    public int maxScoreSightseeingPair(int[] A) {
        if (A == null || A.length < 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int res = A[0];
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, res + A[i] - i);
            res = Math.max(res, A[i] + i);
        }
        return max;
    }
}
