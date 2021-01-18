package leetcode;

import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/1/17 23:47
 * @Version 1.0
 */
public class leetcode1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x = Math.abs(coordinates[0][1] - coordinates[1][1]);
        int y = Math.abs(coordinates[0][1] - coordinates[1][1]);
        for (int i = 0; i < coordinates.length - 1; i++) {
            if (Math.abs(coordinates[i+1][0] - coordinates[i][0]) != x
            || Math.abs(coordinates[i+1][1] - coordinates[i][1]) != y) {
                return false;
            }
        }
        return true;
    }
}
