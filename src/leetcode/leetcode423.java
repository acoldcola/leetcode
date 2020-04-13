package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/13 15:53
 * @Version 1.0
 * 从英文中重建数字
 */
public class leetcode423 {
    public String originalDigits(String s) {
        int[] x = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            x[chars[i]-97] ++;
        }
        if (x['z' - 97] != 0) {
            x['e' - 97] -= x['z' - 97];
        }
        return null;
    }
}
