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
        int[] res = new int[adjacentPairs.length + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < adjacentPairs.length; i++) {
            map.computeIfAbsent(adjacentPairs[i][0], k -> new ArrayList<>()).add(adjacentPairs[i][1]);
            map.computeIfAbsent(adjacentPairs[i][1], k -> new ArrayList<>()).add(adjacentPairs[i][0]);
        }
        for (Integer i : map.keySet()) {
            if (map.get(i).size() == 1) {
                res[0] = i;
                break;
            }
        }
        for (int i = 1; i < res.length; i++) {
            List<Integer> list = map.get(res[i-1]);
            for (Integer x : list) {
                if (map.containsKey(x)) {
                    res[i] = x;
                }
            }
            map.remove(res[i - 1]);
        }
        return res;
    }
}

