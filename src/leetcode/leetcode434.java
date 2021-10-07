package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/10/7 10:40
 * @Version 1.0
 * 字符串中的单词数
 */
public class leetcode434 {
    public int countSegments(String s) {
        if (s == null || "".equals(s.trim())) {
            return 0;
        }
        return s.split("(?<=\\S)\\s+").length;
    }

    public static void main(String[] args) {
        leetcode434 l = new leetcode434();
        l.countSegments(", , , ,        a, eaefa");
    }
}
