package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/2/26 17:05
 * @Version 1.0
 * 猜字谜
 */
public class leetcode1178 {
    public static void main(String[] args) {
        findNumOfValidWords(new String[]{"aaaa","asas","able","ability","actt","actor","access"},
                new String[]{"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"});
    }
    public static List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int mark = 0;
            for (int j = 0; j < words[i].length(); j++) {
                mark |= (1 << words[i].charAt(j) - 'a');
            }
            map.put(mark,map.getOrDefault(mark,0) + 1);
        }
        for (int i = 0; i < puzzles.length; i++) {
            int x = 0;
            int mark = 0;
            for (int j = 0; j < puzzles[i].length(); j++) {
                mark |= (1 << (puzzles[i].charAt(j) - 'a'));
            }
            int b = 1 << (puzzles[i].charAt(0) - 'a');
            int a = mark;
            while (a > 0) {
                if ((a & b) != 0 && map.containsKey(a)) {
                    x += map.get(a);
                }
                a = (a - 1)&mark;
            }
            res.add(x);
        }
        return res;
    }
}
