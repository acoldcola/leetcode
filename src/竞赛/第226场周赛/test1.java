package 竞赛.第226场周赛;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/1/31 10:25
 * @Version 1.0
 */
public class test1 {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int x = 0;
            int temp = i;
            while (temp >= 0) {
                x += temp % 10;
                temp /= 10;
            }
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        int res = 0;
        for (Integer i : map.keySet()) {
            res = Math.max(map.get(i),res);
        }
        return res;
    }
}
