package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/19 10:49
 * @Version 1.0
 * 统计同构子字符串的数目
 */
public class leetcode1759 {
    public int countHomogenous(String s) {
        long sum = 1;
        long res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                sum++;
            }else {
                res = (sum + 1) * sum / 2;
                res %= 1000000007;
                sum = 1;
            }
        }
        res = (sum + 1) * sum / 2;
        res %= 1000000007;
        return (int)res;
    }
}
