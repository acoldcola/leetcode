package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/4 22:27
 * @Version 1.0
 */
public class leetcode58 {
    public int lengthOfLastWord(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        String[] str = s.split(" ");
        if (str == null || str.length == 0) {
            return 0;
        }
        return str[str.length - 1].length();
    }
}
