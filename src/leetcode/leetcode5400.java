package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/3 11:05
 * @Version 1.0
 */
public class leetcode5400 {
    public String destCity(List<List<String>> paths) {
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();
        for (List<String> list : paths) {
            A.add(list.get(0));
            B.add(list.get(1));
        }
        for (String str : B) {
            if (!A.contains(str)){
                return str;
            }
        }
        return null;
    }
}
