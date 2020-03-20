package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/3/6 10:39
 * @Version 1.0
 * 替换子串得到平衡字符串
 */
public class leetcode1234 {
    public static void main(String[] args) {
        String s = "WWEQERQWQWWRWWERQWEQ";
        System.out.println(balancedString(s));
    }
    public static int balancedString(String s) {
        char[] chars = s.toCharArray();
        int[] a = {0,0,0,0};
        int sum = 0;
        for (int i =0; i < chars.length; i++) {
            if (chars[i] == 'Q') {
                a[0] ++;
            }
            if (chars[i] == 'W') {
                a[1] ++;
            }
            if (chars[i] == 'E') {
                a[2] ++;
            }
            if (chars[i] == 'R') {
                a[3] ++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] > chars.length/4) {
                sum += a[j] - chars.length/4;
            }
        }
        return sum;
    }
}
