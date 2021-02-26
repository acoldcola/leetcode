package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/26 13:56
 * @Version 1.0
 * 航班预订统计
 */
public class leetcode1109 {
    public static void main(String[] args) {
        corpFlightBookings(new int[][]{{1,2,10},{2,3,20},{2,5,25}},5);
    }
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        int[] d = new int[n];
        for(int i = 0; i < bookings.length; i++) {
            d[bookings[i][0] - 1] += bookings[i][2];
            if (bookings[i][1] < n) {
                d[bookings[i][1]] -= bookings[i][2];
            }
        }
        for (int i = 1; i < d.length;i++) {
            d[i] = d[i] + d[i-1];
        }
        return d;
    }
}
