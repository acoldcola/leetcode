package 竞赛.第230场周赛;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/3/1 14:02
 * @Version 1.0
 */
public class test1 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        Map<String,Integer> map3 = new HashMap<>();
        int res = 0;
        for (List<String> list : items) {
            map1.put(list.get(0),map1.getOrDefault(list.get(0),0)+1);
            map2.put(list.get(1),map2.getOrDefault(list.get(1),0)+1);
            map3.put(list.get(2),map3.getOrDefault(list.get(2),0)+1);
        }
        if ("type".equals(ruleKey)) {
            if (map1.containsKey(ruleValue)) {
                res = map1.get(ruleValue);
            }

        }else if ("color".equals(ruleKey)){
            if (map2.containsKey(ruleValue)) {
                res = map2.get(ruleValue);
            }

        }else {
            if (map3.containsKey(ruleValue)) {
                res = map3.get(ruleValue);
            }
        }
        return res;
    }
}
