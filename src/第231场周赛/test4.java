package 第231场周赛;

/**
 * @Author ZhangKe
 * @Date 2021/3/7 10:29
 * @Version 1.0
 */
public class test4 {
    public boolean checkOnesSegment(String s) {
        if (s.length() == 1 && s.charAt(0) == '1') {
            return true;
        }
        boolean falg = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                falg = true;
            }
            if (i > 1) {
                if (s.charAt(i) == '1' && falg && s.charAt(i - 1) == '0') {
                    return false;
                }
            }
        }
        return falg;
    }
}
