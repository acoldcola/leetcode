package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/6/28 10:30
 * @Version 1.0
 */
public class leetcode5488 {
    public static void main(String[] args) {
        leetcode5488 leetcode5488 = new leetcode5488();

        System.out.println(leetcode5488.isPathCrossing("NESWW"));
    }
    public boolean isPathCrossing(String path) {
        char[] chars = path.toCharArray();
        int x = 0;
        int y = 0;
        Map<String,Integer> map = new HashMap<>();
        map.put("0_0",1);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'N') {
                y++;
            }
            if (chars[i] == 'S') {
                y--;
            }
            if (chars[i] == 'E') {
                x++;
            }
            if (chars[i] == 'W') {
                x--;
            }
            String string = x +"_" + y;
            if (map.containsKey(string)) {
                if (map.get(string) == 1) {
                    return true;
                }
            }else {
                map.put(string,1);
            }
        }
        return false;
    }
}
