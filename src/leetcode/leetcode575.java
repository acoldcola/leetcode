package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2021/11/1 20:10
 * @Version 1.0
 */
public class leetcode575 {
    public static void main(String[] args) {
        distributeCandies(new int[]{1000,1,1,1});
    }
    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        return candyType.length / 2 > set.size() ? set.size() : candyType.length / 2;
    }
}
