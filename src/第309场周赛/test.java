package 第309场周赛;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2022/9/4 10:31
 * @Version 1.0
 */
public class test {
    public boolean checkDistances(String s, int[] distance) {
        int[] a = new int[26];
        Arrays.fill(a,-1);
        for (int i =0; i < s.length();i ++) {
            if (a[s.charAt(i)-'a'] == -1) {
                a[s.charAt(i)-'a'] = i;
            }else {
                a[s.charAt(i)-'a'] = i - a[s.charAt(i)-'a'] - 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1 && a[i] != distance[i]) {
                return false;
            }
        }
        return true;
    }
}
