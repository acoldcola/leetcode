package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/1/17 10:31
 * @Version 1.0
 */
public class leetcode5653 {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rectangles.length; i++) {
            int a  = Math.min(rectangles[i][0],rectangles[i][1]);
            map.put(a,map.getOrDefault(a,0)+1);
            max = Math.max(a,max);
        }
        return map.get(max);
    }
}
