package leetcode;

import java.util.logging.XMLFormatter;

/**
 * @Author ZhangKe
 * @Date 2020/5/28 9:37
 * @Version 1.0
 * 字符串解码
 */
public class leetcode394 {
    public static void main(String[] args) {
        leetcode394 l = new leetcode394();
        l.decodeString("3[a]2[bc]");
    }
    public String decodeString(String s) {
        if ("".equals(s) || s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int sum = 0;
            int x = 0;
            if (chars[i] >= '0' && chars[i] <= '9') {
                while (chars[i] >= '0' && chars[i] <= '9') {
                     x = x * 10 + Integer.parseInt(String.valueOf(chars[i]));
                     i++;
                }
                int max = 0;
                if (chars[i] == '[') {
                    sum++;
                    while (sum != 0) {
                        i++;
                        if (chars[i] == '[') {
                            sum++;
                        } else if (chars[i] == ']') {
                            sum--;
                        }
                        if (sum != 0) {
                            stringBuilder.append(chars[i]);
                        }
                        max = Math.max(sum, max);
                    }
                    String string = decodeString(stringBuilder.toString());
                    stringBuilder = new StringBuilder().append(string);
                    for (int i1 = 0; i1 < x; i1++) {
                        sb.append(stringBuilder);
                    }
                }
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}