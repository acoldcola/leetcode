package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/6/17 17:01
 * @Version 1.0
 * 子串的最大出现次数
 */
public class leetcode1297 {
    Map<String,Integer> map = new HashMap<>();
    int[] a = new int[26];
    char[] chars;

    public static void main(String[] args) {
        leetcode1297 leetcode1297 = new leetcode1297();
        leetcode1297.maxFreq("aabcabcab",2,2,4);
    }
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        if (minSize > s.length()) {
            return 0;
        }
        chars = s.toCharArray();
        int i = 0;
        int j = minSize - 1;
        for (int m = i; m <= j; m++) {
            a[chars[m] - 'a'] ++;
        }
        add(s,i,j,maxLetters);
        i++;
        j++;
        while (j < s.length()) {
            a[chars[i - 1] - 'a']--;
            a[chars[j] - 'a']++;
            add(s,i++,j++,maxLetters);
        }
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            max = Math.max(max,entry.getValue());
        }
        return max;
    }
    public void add(String s,int left,int right,int maxLetters) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum++;
            }
        }
        if (sum <= maxLetters) {
            map.put(s.substring(left,right+1),map.getOrDefault(s.substring(left,right+1),0) + 1);
        }
    }
}
