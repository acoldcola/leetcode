package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/5/27 16:05
 * @Version 1.0
 */
public class leetcode974 {
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;
        int size = A.length;
        for (int i = 0; i < size; i++) {
            count += A[i];
            int res = (count % K + K) % K;
            int c = map.getOrDefault(res,0);
            sum += c;
            map.put(res,c + 1);
        }
        return sum;
    }
}
