package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/1/17 10:34
 * @Version 1.0
 */
public class leetcode5243 {
    public static void main(String[] args) {
        tupleSameProduct(new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192});
    }

    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int x = nums[i] * nums[j];
                if (map.containsKey(x)) {
                    int y = map.get(x);
                    map.put(x, y + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }
        int res = 0;
        for (Integer i : map.keySet()) {
            Integer x = map.get(i);
            if (x > 1) {
                res += (4*(x - 1)) * x;
            }
        }
        return res;
    }
}
