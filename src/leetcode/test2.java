package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/4/18 15:19
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        test2 test2 = new test2();
        //test2.getTriggerTime(new int[][] {{2,8,4},{2,5,0},{10,9,8}},new int[][] {{2,11,3},{15,10,7},{9,17,12},{8,1,14}});
        test2.getTriggerTime(new int[][] {{1,1,1}},new int[][] {{0,0,0}});
    }
    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int[] time = new int[requirements.length];
        Arrays.fill(time,-1);
        int[][] a = new int[increase.length + 1][requirements[0].length];
        a[0][0] = 0;
        a[0][1] = 0;
        a[0][2] = 0;
        for (int i = 1;i <= increase.length;i++) {
            a[i][0] = a[i-1][0] + increase[i-1][0];
            a[i][1] = a[i-1][1] + increase[i-1][1];
            a[i][2] = a[i-1][2] + increase[i-1][2];
        }
        for (int i = 0; i < requirements.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if (a[j][0] >= requirements[i][0]
                && a[j][1] >= requirements[i][1] && a[j][2] >= requirements[i][2]) {
                    time[i] = j;
                    break;
                }
            }
        }
        return time;
    }
}
