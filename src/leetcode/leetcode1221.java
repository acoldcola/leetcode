package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/3/20 14:56
 * @Version 1.0
 * 分割平衡字符串
 */
public class leetcode1221 {
    public int balancedStringSplit(String s) {
        int[] a = {0,0};
        int x = 0;
        char[] chars = s.toCharArray();
        for (int i = 0;i < chars.length; i++) {
            if ('R' == chars[i]) {
                a[0]++;
            }else if('L' == chars[i]) {
                a[1]++;
            }
            if (a[0] == a[1]) {
                x++;
                a[0] = a[1] = 0;
            }
        }
        return 0;
    }
}
