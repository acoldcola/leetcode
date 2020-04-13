package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/13 13:15
 * @Version 1.0
 * 重复的子字符串
 */
public class leetcode459 {
    public static void main(String[] args) {
        leetcode459 leetcode459 = new leetcode459();
        leetcode459.repeatedSubstringPattern("aba");
    }
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1,(s+s).length()-1).contains(s);
    }
}
