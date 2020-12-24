package leetcode;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/12/24 11:17
 * @Version 1.0
 * 分发糖果
 */
public class leetcode135 {
    public int candy(int[] ratings) {
        int sum = 0;
        if (ratings == null || ratings.length == 0) {
            return sum;
        }
        // 从左遍历到右
        int[] left = new int[ratings.length];
        Arrays.fill(left,1);
        for(int i = 1;i < left.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        // 从右遍历到左
        int[] right = new int[ratings.length];
        Arrays.fill(right,1);
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                right[i] = right[i + 1] + 1;
            }
            sum += Math.max(left[i],right[i]);
        }
        return sum += Math.max(left[ratings.length - 1], right[ratings.length - 1]);
    }
}
