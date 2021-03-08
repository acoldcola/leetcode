package 竞赛.第47场双周赛;

/**
 * @Author ZhangKe
 * @Date 2021/3/6 22:27
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        nearestValidPoint(3,4,new int[][]{{1,2},{3,1},{2,4},{2,3},{4,4}});
    }
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int res = Integer.MAX_VALUE;
        int sum = -1;
        for (int i = 0; i < points.length;i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int a = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (res >= a) {

                    if (res == a) {
                        sum = Math.min(sum,i);
                    }else {
                        sum = i;
                    }
                    res = a;
                }
            }
        }
        return  sum;
    }
}
