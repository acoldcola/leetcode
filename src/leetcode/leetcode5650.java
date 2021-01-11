package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/1/10 11:03
 * @Version 1.0
 */
public class leetcode5650 {
    public static void main(String[] args) {
        leetcode5650 l = new leetcode5650();
//        l.minimumHammingDistance(new int[] {50,46,54,35,18,42,26,72,75,47,50,4,54,21,18,18,61,64,100,14},new int[] {83,34,43,73,61,94,10,68,74,31,54,46,28,60,18,18,4,44,79,92},
//                new int[][] {{1,8},{14,17},{3,1},{17,10},{18,2},{7,12},{11,3},{1,15},{13,17},{18,19},{0,10},{15,19},{0,15},{6,7},{7,15},{19,4},{7,16},{14,18},{8,10},{17,0},{2,13},{14,10},{12,17},{2,9},{6,15},{16,18},{2,16},{2,6},{4,5},{17,5},{10,13},{7,2},{9,16},{15,5},{0,5},{8,0},{11,12},{9,7},{1,0},{11,17},{4,6},{5,7},{19,12},{3,18},{19,1},{13,18},{19,6},{13,6},{6,1},{4,2}});
        l.minimumHammingDistance(new int[]{2,1,0},new int[]{1,2,0},new int[][]{{0,1},{1,2}});
    }
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int[] a  = new int[source.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < allowedSwaps.length; i++) {
            a[find1(allowedSwaps[i][0],a)] = a[find1(allowedSwaps[i][1],a)];
        }
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            List<Integer> list = map.getOrDefault(find1(a[i],a),new ArrayList<>());
            list.add(i);
            map.put(find1(a[i],a),list);
        }
        int res = 0;
        for (Integer x : map.keySet()) {
            List<Integer> list = map.get(x);
            Map<Integer,Integer> map1 = new HashMap<>();
            Map<Integer,Integer> map2 = new HashMap<>();
            for (int j = 0; j < list.size(); j++) {
                int y = list.get(j);
                map1.put(source[y],map1.getOrDefault(source[y],0) + 1);
                map2.put(target[y],map2.getOrDefault(target[y],0) + 1);
            }
            for (Integer s : map1.keySet()) {
                if (map2.containsKey(s)) {
                    if(map2.get(s) < map1.get(s)) {
                        res = res + map1.get(s) -map2.get(s);
                    }
                }else {
                    res += map1.get(s);
                }
            }
        }
        return res;
    }

    public int find1(int x, int[] nums) {
       if (x != nums[x]) {
           nums[x] = find1(nums[x],nums);
       }
       return nums[x];
    }

}
