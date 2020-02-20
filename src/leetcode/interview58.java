package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/2/20 11:27
 * @Version 1.0
 * 左旋转字符串
 */
public class interview58 {
    public String reverseLeftWords(String s, int n) {
        String a = s.substring(0,n);
        String b = s.substring(n+1,s.length());
        return b+a;
    }
}
