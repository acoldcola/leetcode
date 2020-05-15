package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * @Author ZhangKe
 * @Date 2020/5/13 15:55
 * @Version 1.0
 */
public class leetcode1048 {
    public static void main(String[] args) {
        longestStrChain(new String[] {"lz","qlsz","eqolnsz","ghphjykf","vf","adv","qlz","zstvf","fi","fedxfum","ilfs","st","tvf","v","ifs","sgilfgelfs","aodv","if","gphjyf","ilfefs"});
    }
    public static int longestStrChain(String[] words) {
        Arrays.sort(words,(o1,o2) -> o1.length() - o2.length());
        List<int[]> list = new ArrayList<>();
        for (int i = 0;i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int[] a = new int[26];
            for (int j = 0; j < chars.length; j++) {
                a[chars[j] - 'a']++;
            }
            list.add(a);
        }
        int max = 1;
        for (int i = 0; i < words.length - 1; i++) {
            int[] a = list.get(i);
            int num = i;
            int h = i + 1;
            while (h < words.length) {
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[j].length() - words[num].length() > 1 || words[j].equals(words[num])) {
                        max = Math.max(count, max);
                        break;
                    }
                    boolean judge = true;
                    int[] b = list.get(j);
                    for (int k = 0; k < 26; k++) {
                        if (b[k] < a[k]) {
                            judge = false;
                            break;
                        }
                    }
                    if (judge) {
                        num = j;
                        count++;
                        a = b;
                    }
                }
                max = Math.max(count,max);
                h++;
            }
        }
        return max;
    }
}
