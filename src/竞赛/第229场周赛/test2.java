package 竞赛.第229场周赛;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2021/2/21 10:25
 * @Version 1.0
 */
public class test2 {
    public int[] minOperations(String boxes) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i)=='1') {
                set.add(i);
            }
        }
        int[] res = new int[boxes.length()];
        for (int i = 0; i < res.length; i++) {
            int a = 0;
            for (Integer x : set) {
                a += Math.abs(x - i);
            }
            res[i] = a;
        }
        return res;
    }
}
