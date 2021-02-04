package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/2/4 16:04
 * @Version 1.0
 *  用户分组
 */
public class leetcode1282 {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<List<Integer>>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<List<Integer>> lists = map.getOrDefault(groupSizes[i],new ArrayList<>());
            if (lists.size() == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                lists.add(list);
            }else {
                boolean flag = true;
                for (List l : lists) {
                    if (l.size() != groupSizes[i]) {
                        l.add(i);
                        flag = false;
                    }
                }
                if (flag) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    lists.add(list);
                }
            }
            map.put(groupSizes[i],lists);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (Integer i : map.keySet()) {
            List<List<Integer>> lists = map.get(i);
            res.addAll(lists);
        }
        return res;
    }
}
