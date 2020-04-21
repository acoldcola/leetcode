package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 21:59
 * @Version 1.0
 * 压缩字符串
 */
public class leetcode443 {
    public static void main(String[] args) {
        compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'});
    }
    public static int compress(char[] chars) {
        List<Character> list = new ArrayList<>();
        int i = 0;
        while (i < chars.length) {
            list.add(chars[i]);
            int j = i + 1;
            int num = 0;
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
                num++;
            }
            if (num != 0) {
                num++;
                if (num > 10) {
                 while (num > 0) {
                     char[] a = String.valueOf(num).toCharArray();
                     for (int n = 0 ; n < a.length; n++) {
                         list.add(a[n]);
                     }
                 }
                }else {
                    list.add(String.valueOf(num).toCharArray()[0]);
                }
            }
            i = j;
        }
        for (int m = 0; m < list.size();m++) {
            chars[m] = list.get(m);
        }
        return list.size();
    }
}
