package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/1/5 10:43
 * @Version 1.0
 * 较大分组的位置  
 */
public class leetcode830 {
    public static void main(String[] args) {
        largeGroupPositions("aaa");
    }
    public static List<List<Integer>> largeGroupPositions(String s) {
        int left = 0;
        int right = 0;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
                right++;
            }else {
                if (right - left >= 2) {
                    List<Integer> list = new ArrayList<>();
                    list.add(left);
                    list.add(right);
                    lists.add(list);
                }
                left = i+1;
                right = i+1;
            }
        }
        return lists;
    }
}
