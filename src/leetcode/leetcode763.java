package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/3/5 15:43
 * @Version 1.0
 *  划分字母区间
 */
public class leetcode763 {
    public List<Integer> partitionLabels(String S) {
        if (S == null || "".equals(S)) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int[] a = new int[26];
        char[] chars = S.toCharArray();
        // 取到字母最后一次出现的位置
        for (int i = 0; i < chars.length; i++) {
            a[chars[i] -'a'] = i;
        }
        int i = 0;
        int j = 0;
        int res = 0;
        for (int i1 = 0; i1 < chars.length; i1++) {
            j = Math.max(j,a[chars[i1]-'a']);
            if (i1 == j) {
                list.add(i1- res + 1);
                res = i1 + 1;
            }
        }
        return list;
    }
}
