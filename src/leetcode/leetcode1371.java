package leetcode;
import java.util.HashMap;

/**
 * @Author ZhangKe
 * @Date 2020/5/20 9:30
 * @Version 1.0
 * 每个元音包含偶数次的最长子字符串
 */
public class leetcode1371 {
    public static void main(String[] args) {
        findTheLongestSubstring("eleetminico");
    }
    public static int findTheLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        // 用来记录元音字母的记录
        int count = 0;
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        // 字母第一出现的位置
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o'|| chars[i] == 'u'){
                int x = map.getOrDefault(chars[i],i);
                map.put(chars[i],map.getOrDefault(chars[i],i));
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o'|| chars[i] == 'u'){
                count ^= chars[i];
                if (count == 0) {
                    res = Math.max(i + 1,res);
                }else {
                    res = Math.max(i - map.get(chars[i]),res);
                }
            } else {
                res = res + 1;
            }
        }
        return res;
    }
}
