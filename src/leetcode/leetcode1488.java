package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/3/12 17:35
 * @Version 1.0
 * 避免洪水泛滥
 */
public class leetcode1488 {
    public static int[] avoidFlood(int[] rains) {
        List<Integer> deque = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int[] a = new int[rains.length];
        Arrays.fill(a,1);
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] > 0) {
                a[i] = -1;
                if (map.containsKey(rains[i])) {
                    if (deque.size() == 0) {
                        return new int[0];
                    }else {
                        for (int j = 0; j < deque.size(); j++) {
                            int x = deque.get(j);
                            if (x > map.get(rains[i])) {
                                a[x] = rains[i];
                                map.remove(rains[i]);
                                deque.remove(j);
                                break;
                            }
                        }
                        if (map.containsKey(rains[i])) {
                            return new int[0];
                        }
                        map.put(rains[i],i);
                    }
                }else {
                    map.put(rains[i],i);
                }
            }else {
                deque.add(i);
            }
        }
        return a;
    }
}
