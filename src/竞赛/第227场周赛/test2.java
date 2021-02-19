package 竞赛.第227场周赛;

import sun.java2d.pipe.AAShapePipe;

import java.lang.reflect.Member;
import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/2/7 10:27
 * @Version 1.0
 */
public class test2 {
    public int maximumScore(int a, int b, int c) {
        int[] res = new int[3];
        res[0] = a;
        res[1] = b;
        res[2] = c;
        Arrays.sort(res);
        int sum = 0;
        while (true) {
            if (res[0] == 0 && res[1] == 0 || res[1] == 0 && res[2] == 0 || res[0] == 0 && res[2] == 0) {
                break;
            }
            if (res[0] == 0) {
                sum++;
                res[1]--;
                res[2]--;
            }else {
                sum++;
                res[0]--;
                res[2]--;
                if (res[1] > res[2]) {
                    res[1] ^= res[2];
                    res[2] ^= res[1];
                    res[1] ^= res[2];
                }
            }
        }
        return sum;
    }
}
