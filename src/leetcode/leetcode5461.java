package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/12 10:33
 * @Version 1.0
 */
public class leetcode5461 {
    public static void main(String[] args) {
        leetcode5461 l = new leetcode5461();
    }
    public int numSub(String s) {
        long  res = 0;
        String[] str = s.split("0");
        for (int i = 0; i < str.length; i++) {
            long n = str[i].length();
            res += (n*n + n)/2;
            res = res % (1000000000 + 7);
        }
        return (int) res ;
    }
}
