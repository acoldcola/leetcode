package 竞赛.第226场周赛;

/**
 * @Author ZhangKe
 * @Date 2021/1/31 10:25
 * @Version 1.0
 */
public class test3 {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        long[] sum = new long[candiesCount.length + 1];
        sum[0] = 0;
        for (int i = 0; i < sum.length; i++) {
            sum[i] = sum[i - 1] + candiesCount[i - 1];
        }
        boolean[] res = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            long b = queries[i][1] + 1;
            long c = queries[i][2];
            if (b * c > sum[a] && b <= sum[a + 1]) {
                res[i] = true;
            }
        }
        return res;
    }
}
