package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/15 11:15
 * @Version 1.0
 * 单调递增的数字
 */
public class leetcode738 {
    public static void main(String[] args) {
        leetcode738 l = new leetcode738();
        l.monotoneIncreasingDigits(332);
    }

    public int monotoneIncreasingDigits(int N) {
        String str = String.valueOf(N);
        // 找出第一个单调不递增的数字
        int res = -1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                res = i;
                break;
            }
        }
        if (res == -1) {
            return N;
        }
        char[] chars = str.toCharArray();
        for (int j = chars.length - 1; j >=0 ; j--) {
            if (j == res) {
                int x = Integer.parseInt(String.valueOf(chars[j]));
                x -= 1;
                chars[j] = String.valueOf(x).charAt(0);
            }
            if (j > res) {
                chars[j] = '9';
            }else {
                if (chars[j]> chars[j + 1]) {
                    chars[j] = chars[j + 1];
                    chars[j + 1] = '9';
                }
            }
        }
        return Integer.valueOf(String.valueOf(chars));
    }
}
