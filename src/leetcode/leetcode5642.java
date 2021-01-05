package leetcode;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author ZhangKe
 * @Date 2021/1/3 10:42
 * @Version 1.0
 */
public class leetcode5642 {
    public static void main(String[] args) {
        countPairs(new int[]{});
    }
    public static int countPairs(int[] deliciousness) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i <= 21; i++) {
            long res = 1;
            int j = i;
            while (j >= 1){
                res = res * 2;
                j--;
            }
            list.add(res);
        }
        Map<Long,Integer> map = new HashMap<>();
        for (int i = 0; i < deliciousness.length;i++) {
            long m = deliciousness[i];
            map.put(m,map.getOrDefault(m,0) + 1);
        }
        int sum = 0;
        Iterator<Map.Entry<Long, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Integer> entry = it.next();
            Long a = entry.getKey();
            for (int j = 0; j < list.size(); j++) {
                long m = list.get(j) - a;
                if (map.containsKey(m)) {
                    System.out.println(a +"-"+m);
                    if (a == m) {
                        long x = map.get(a);
                        x -= 1;
                        x =  x*(x+1)/2;
                        x %= (1e9+7);
                        sum += x;
                    }else {
                        sum += map.get(a) * map.get(m);
                    }
                    sum %= 1000000007;
                }
            }
            it.remove();
        }
        return sum;
    }

}
