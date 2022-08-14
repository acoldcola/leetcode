import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/3/21 13:56
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        groupThePeople(new int[]{3,3,3,3,3,1,3});
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (map.containsKey(groupSizes[i])) {
                List<Integer> list = map.get(groupSizes[i]);
                list.add(i);
                map.put(groupSizes[i],list);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(groupSizes[i],list);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (Integer integer : map.keySet()) {
            int num = map.get(integer).size() / integer;
            for (int i = 0; i < num; i++) {
                List<Integer> list = new ArrayList<>();
                List<Integer> target = map.get(integer);
                for (int j = i * integer; j < (i + 1) * integer; i++) {
                    list.add(target.get(j));
                }
                res.add(list);
            }
        }
        return res;
    }
}
