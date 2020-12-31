package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author ZhangKe
 * @Date 2020/12/31 10:21
 * @Version 1.0
 * 无重叠区间
 */
public class leetcode435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int left = intervals[0][0];
        int right = intervals[0][1];
        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            // 删除区间
            if (intervals[i][0] < right) {
                if (right > intervals[i][1]) {
                    right = intervals[i][1];
                    left = intervals[i][0];
                }
                res ++;
            }else {
                right = intervals[i][1];
                left = intervals[i][0];
            }
        }
        return res;
    }
}
