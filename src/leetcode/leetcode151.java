package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/10 13:33
 * @Version 1.0
 * 翻转字符串里的单词
 */
public class leetcode151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        String[] str = s.split("\\s+");
        List<String> list = Arrays.asList(str);
        Collections.reverse(list);
        return String.join(" ",list);
    }
}
