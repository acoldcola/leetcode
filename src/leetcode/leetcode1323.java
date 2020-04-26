package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/23 23:54
 * @Version 1.0
 * 6 和 9 组成的最大数字
 */
public class leetcode1323 {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        boolean x = true;
        for(int i = 0; i < s.length(); i++)
        {
            if('6' == chars[i] && x)
            {
                chars[i] = '9';
                x = false;
            }
            stringBuilder.append(chars[i]);
        }
        return Integer.valueOf(stringBuilder.toString());
    }
}
