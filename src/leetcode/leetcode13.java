package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/12/19 17:35
 * @Version 1.0
 * 罗马数字转整数
 */
public class leetcode13 {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            if (i < s.length() - 1) {
                if (map.containsKey(s.substring(i, i + 2))) {
                    sum += map.get(s.substring(i, i + 2));
                    i++;
                    flag = true;
                }
            }
            if (!flag) {
                sum += map.get(s.substring(i, i + 1));
            }
        }
        return sum;
    }
}
