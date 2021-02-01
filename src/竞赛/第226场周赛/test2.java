package 竞赛.第226场周赛;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/1/31 10:25
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        restoreArray(new int[][] {{2,1},{3,4},{3,2}});
    }
    public static int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < adjacentPairs.length; i++) {
            if (map1.containsKey(adjacentPairs[i][0])) {
                if (map1.containsKey(adjacentPairs[i][1])) {
                    if (map1.containsKey(map1.get(adjacentPairs[i][0]))) {
                        int x = map1.get(adjacentPairs[i][1]);
                        map1.put(x,adjacentPairs[i][1]);
                        map1.remove(adjacentPairs[i][1]);
                    }else {
                        int x = map1.get(adjacentPairs[i][0]);
                        map1.put(x ,adjacentPairs[i][0]);
                        map1.remove(adjacentPairs[i][0]);
                    }
                    map1.put(adjacentPairs[i][0],adjacentPairs[i][1]);
                }else {
                    map1.put(adjacentPairs[i][1],adjacentPairs[i][0]);
                }
            }else {
                map1.put(adjacentPairs[i][0],adjacentPairs[i][1]);
            }
            map2.put(adjacentPairs[i][0],map2.getOrDefault(adjacentPairs[i][0],0) + 1);
            map2.put(adjacentPairs[i][1],map2.getOrDefault(adjacentPairs[i][1],0) + 1);
        }
        int a = 0;
        for (Integer i : map2.keySet()) {
            int x = map2.get(i);
            if (x == 1 && map1.containsKey(i)) {
                a = i;
            }
        }
        int[] res = new int[adjacentPairs.length + 1];
        res[0] = a;
        for (int i = 1; i < res.length; i++) {
            int x = map1.get(a);
            res[i] = x;
            a = x;
        }
        return res;
    }
}

