package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/1 16:03
 * @Version 1.0
 * 机器人大冒险
 */
public class LCP_03 {
    public static void main(String[] args) {
        LCP_03 lcp_03 = new LCP_03();
        int[][] a = new int[][] {{4,2}};
        lcp_03.robot("RRU",a,3,2);
    }
    public boolean robot(String command, int[][] obstacles, int x, int y) {
        int o = 0; int p = 0;
        for (int i = 0; i < obstacles.length;i++) {
            if (obstacles[i][0] > x || obstacles[i][0] < 0 || obstacles[i][1] > y || obstacles[i][1] < 0) {
                continue;
            }
            o = Math.max(o,obstacles[i][0]);
            p = Math.max(p,obstacles[i][1]);
        }
        int[][] a = new int[o+1][p+1];
        if (o != 0 && p != 0) {
            for (int i = 0; i < obstacles.length; i++) {
                a[o - obstacles[i][0]][obstacles[i][1]] = 1;
            }
        }
        char[] chars = command.toCharArray();
        int m = y;
        int n = 0;
        while (true) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'U') {
                    m--;
                    o--;
                } else {
                    n++;
                }
                if (m==0 && n == x) {
                    return true;
                }
                if (o >= 0 && n < a[0].length && a[o][n] == 1) {
                    return false;
                }
                if (m < 0 && n >= y) {
                    return false;
                }
            }
        }
    }
}
