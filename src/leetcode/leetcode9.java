package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/8/1 18:18
 *回文数
 */
public class leetcode9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        int m = str.length() - 1;
        for(int i = 0; i < str.length()/2; i++) {
            if (chars[i] != chars[m --]) {
                return false;
            }
        }
        return true;
    }
}
