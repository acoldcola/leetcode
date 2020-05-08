package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/2 22:31
 * @Version 1.0
 */
public class leetcode5384 {
    public static void main(String[] args) {
        kidsWithCandies(new int[] {2,8,7},1);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            boolean x = true;
            int y = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (y < candies[j]) {
                    x = false;
                }
            }
            list.add(x == true);
        }
        return list;
    }
}
