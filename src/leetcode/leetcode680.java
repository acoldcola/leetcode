package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/19 9:55
 * @Version 1.0
 */
public class leetcode680 {
    public static void main(String[] args) {
        validPalindrome("bececcecb");
    }
    public static boolean validPalindrome(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left <= right) {
            if (chars[left++] != chars[right--]){
                return isValid(chars,left,++right) || isValid(chars,--left,--right);
            }
        }
        return true;
    }
    public static boolean isValid(char[] chars,int left,int right) {
        while (left <= right) {
            if (chars[left++] != chars[right--]) {
                return false;
            }
        }
        return true;
    }
}
