package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/13 14:16
 * @Version 1.0
 * 一次编辑
 */
public class interview01_05 {
    public static void main(String[] args) {
        interview01_05 interview01_05 = new interview01_05();
        interview01_05.oneEditAway("a","ab");
    }
    public boolean oneEditAway(String first, String second) {
        if (first.length() == 0 || second.length() == 0) {
            first += " ";
            second += " ";
        }
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        int num = 0;
        if (first.length() > second.length()) {
            int j = 0;
            for (int i = 0; i < a.length && j < b.length; i++) {
                if (a[i] != b[j++]) {
                    j--;
                    num ++;
                }
            }
        }
        if (first.length() < second.length()) {
            int j = 0;
            for (int i = 0; i < b.length&& j < a.length; i++) {
                if (b[i] != a[j++]) {
                    j--;
                    num ++;
                }
            }
        }
        if (first.length() == second.length()) {
            for (int i = 0; i < b.length; i++) {
                int j = i;
                if (b[i] != a[j]) {
                    num ++;
                }
            }
        }
        return num <= 1 ? true : false;
    }
}
