package 竞赛.第46场双周赛;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/2/20 22:21
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        test1 test1 = new test1();
        test1.longestNiceSubstring("YazaAay");
    }
    public String longestNiceSubstring(String s) {
        int max = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            int[] a = new int[26];
            int[] b = new int[26];
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) - 'A' > 26) {
                    b[s.charAt(j) - 'a']++;
                }else {
                    a[s.charAt(j) - 'A']++;
                }
                if (check(a,b)) {
                    if (max < j - i + 1) {
                        max = j - i + 1;
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }

    public boolean check(int[] a,int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] > 0 && b[i] == 0) {
                return false;
            }else if (a[i] == 0 && b[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
