package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 9:19
 * @Version 1.0
 * 合并区间
 */
public class leetcode56 {
    public static void main(String[] args) {
        int[][] a = {{1,4},{0,2},{3,5}};
        merge(a);
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length;i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            for (int j = i + 1; j < intervals.length; j++) {
                if (right >= intervals[j][0]) {
                    right = right > intervals[j][1] ? right : intervals[j][1];
                    i = j;
                }else {
                    break;
                }
            }
            list.add(new int[] {left,right});
        }
        int[][] last = new int[list.size()][2];
        return list.toArray(last);
    }
    public static void swap(int[][] swap ,int m,int n) {
        for (int i = 0; i < 2; i++) {
            int temp = swap[m][i];
            swap[m][i] = swap[n][i];
            swap[n][i] = temp;
        }
    }
}
