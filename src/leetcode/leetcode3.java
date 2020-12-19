package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/12/19 16:23
 * @Version 1.0
 * 无重复字符的最长子串
 */
public class leetcode3 {
    public static void main(String[] args) {
        leetcode3 leetcode3 = new leetcode3();
        leetcode3.lengthOfLongestSubstring("abba");
    }
    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        int left = 0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (map.containsKey(a)) {
                left = map.get(a) < left ? left : map.get(a) + 1;
            }
            max = Math.max(max,i - left);
            map.put(a,i);
        }
        return max + 1;
    }
}
