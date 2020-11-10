package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/11/9 15:18
 * @Version 1.0
 * 最接近原点的 K 个点
 */
public class leetcode973 {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, (point1, point2) -> (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]));
        return Arrays.copyOfRange(points, 0, K);
    }
}
