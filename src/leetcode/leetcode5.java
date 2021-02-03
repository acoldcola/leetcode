package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/21 17:02
 * @Version 1.0
 *  最长回文子串
 */
public class leetcode5 {
    public static void main(String[] args) {
        leetcode5 l = new leetcode5();
        l.longestPalindrome("babab");
    }
    /*public String longestPalindrome(String s) {
        if (s == null || "".equals(s) || s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        for (int i = 0; i < chars.length; i++) {
            int len1 = judge(chars,i,i);
            int len2 = judge(chars,i,i+1);
            int len = Math.max(len1,len2);
            if (len > right - left) {
                left = i - (len-1)/2;
                right = i + len/2;
            }
        }
        return s.substring(left,right + 1);
    }
    public int judge(char[] chars,int left,int right){
        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }*/
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                    if (i-j > (right - left)) {
                        left = j;
                        right = i;
                    }
                }
            }
        }
        return s.substring(left,right + 1);
    }
}
