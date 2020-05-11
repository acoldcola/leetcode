package leetcode;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/10 10:31
 * @Version 1.0
 */
public class leetcode5404 {
    public static void main(String[] args) {
        buildArray(new int[] {1,3},3);
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int span = 1;
        for (int i = 0; i < target.length; i++) {
            int x = span;
            while (target[i] - (i+x) > 0) {
                list.add("push");
                list.add("pop");
                target[i]--;
                span ++;
            }
            list.add("push");
        }
        return list;
    }
}
