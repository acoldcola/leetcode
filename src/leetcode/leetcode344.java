package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/10/8 20:30
 * @Version 1.0
 * 反转字符串
 */
public class leetcode344 {
    public void reverseString(char[] s) {
        int sum = s.length - 1;
        for (int i = 0; i < s.length/2; i++){
            char temp = s[i];
            s[i] = s[sum - i];
            s[sum - i] = temp;
        }
    }
}
