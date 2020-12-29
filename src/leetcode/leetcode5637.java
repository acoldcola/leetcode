package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/27 10:30
 * @Version 1.0
 */
public class leetcode5637 {
    public static void main(String[] args) {
        halvesAreAlike("Uo");
    }
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length()/2; i++){
            int j = i + s.length() / 2;
            char a = s.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                left++;
            }
            char b = s.charAt(j);
            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u'){
                right++;
            }
        }
        return left == right;
    }
}
