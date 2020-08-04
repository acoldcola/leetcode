package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/7/25 23:04
 * @Version 1.0
 */
public class leetcode5458 {
    public static void main(String[] args) {
        leetcode5458 leetcode5458 = new leetcode5458();
        leetcode5458.numSplits("sjhnb");
    }
    public int numSplits(String s) {
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int x = diff(s.substring(0,i));
            int y = diff(s.substring(i,s.length()));
            if (x == y) {
                sum++;
            }
        }
        return sum;
    }

    public int diff(String str){
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i],map.getOrDefault(chars[i],0) + 1);
        }
        return map.size();
    }
}
