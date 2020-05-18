package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/16 22:30
 * @Version 1.0
 */
public class leetcode5396 {
    public int maxPower(String s) {
        int max = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int count = 1;
            int j = i + 1;
            while (j < chars.length && chars[i] ==  chars[j]) {
                j++;
                count ++;
            }
            max = Math.max(count,max);
            i = j-1;
        }
        return max;
    }
}
