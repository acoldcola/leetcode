package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/17 13:30
 * @Version 1.0
 * 最短完整词
 */
public class leetcode748 {
    public static void main(String[] args) {

        shortestCompletingWord("1s3 451", new String[]{"looks","pest","stew","show"});
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        char[] chars = licensePlate.toCharArray();
        int[] a = new int[26];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                a[chars[i] - 'a']++;
            }
        }
        int res = 0;
        int mix = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            boolean jug = true;
            int[] b = new int[26];
            char[] str = words[i].toCharArray();
            for (char s : str) {
                b[s - 'a']++;
            }
            for (int j = 0; j < a.length; j++){
                if (b[j] < a[j]){
                    jug = false;
                    break;
                }
            }
            if (jug) {
                if (mix > words[i].length()) {
                    mix = words[i].length();
                    res = i;
                }
            }
        }
        return words[res];
    }
}
