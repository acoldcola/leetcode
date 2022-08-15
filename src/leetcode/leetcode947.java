package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2020/6/2 18:01
 * @Version 1.0
 * 移除最多的同行或同列石头
 */
public class leetcode947 {
    public static void main(String[] args) {
        leetcode947 leetcode947 = new leetcode947();
        leetcode947.removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}});
    }
    public  int removeStones(int[][] stones) {
        int[] a = new int[20002];
        for(int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < stones.length; i++) {
            a[find(stones[i][0] + 10001,a)] = find(stones[i][1], a);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < stones.length; i++) {
            int x = find(stones[i][0] + 10001,a);
            int y = find(stones[i][1],a);
            set.add(x);
            set.add(y);
        }
        return stones.length - set.size();
    }

    public int find(int x, int[] nums) {
        if (x != nums[x]) {
            nums[x] = find(nums[x],nums);
        }
        return nums[x];
    }
}
