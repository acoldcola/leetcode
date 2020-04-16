package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 15:47
 * @Version 1.0
 * 访问所有点的最小时间
 */
public class leetcode1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            while (points[i][0] != points[i+1][0]
                    && points[i][1] != points[i+1][1]){
                if (points[i][0] > points[i+1][0]) {
                    points[i][0]--;
                }else {
                    points[i][0]++;
                }
                if (points[i][1] > points[i+1][1]) {
                    points[i][1]--;
                }else {
                    points[i][1]++;
                }
                sum ++;
            }
            while (points[i][0] != points[i+1][0]) {
                if (points[i][0] > points[i+1][0]) {
                    points[i][0]--;
                }else {
                    points[i][0]++;
                }
                sum++;
            }
            while (points[i][1] != points[i+1][1]) {
                if (points[i][1] > points[i+1][1]) {
                    points[i][1]--;
                }else {
                    points[i][1]++;
                }
                sum++;
            }
        }
        return sum;
    }
}
