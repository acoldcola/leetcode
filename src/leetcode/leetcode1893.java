package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/7/23 12:19
 * @Version 1.0
 */
public class leetcode1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges,(o1,o2) -> o1[0] -o2[0]);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < ranges.length - 1; i++) {
            if(ranges[i][1] >= ranges)
        }
    }
}
