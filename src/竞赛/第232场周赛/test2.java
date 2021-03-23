package 竞赛.第232场周赛;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/3/14 10:27
 * @Version 1.0
 */
public class test2 {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            map.put(edges[i][0],map.getOrDefault(edges[i][0],0) + 1);
            map.put(edges[i][1],map.getOrDefault(edges[i][1],0) + 1);
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == edges.length - 1) {
                return i;
            }
        }
        return 0;
    }
}
