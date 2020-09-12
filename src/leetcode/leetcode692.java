package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/9/11 17:43
 * @Version 1.0
 * 前K个高频单词
 */
public class leetcode692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str,map.getOrDefault(str,0) + 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(o1,o2) -> map.get(o1).equals(map.get(o2))
                ? o1.compareTo(o2) : map.get(o2) - map.get(o1));
        return list.subList(0,k);
    }
}
