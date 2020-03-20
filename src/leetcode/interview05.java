package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/3/20 14:48
 * @Version 1.0
 * 替换空格
 */
public class interview05 {
    public String replaceSpace(String s) {
        if ("".equals(s) || s.length() == 0) {
            return null;
        }
        s = s.replace(" ","%20");
        return s;
    }
}
