package leetcode;

import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/9/15 15:29
 * @Version 1.0
 */
public class offer14_1 {
    public static void main(String[] args) {
        offer14_1 l = new offer14_1();
        l.cuttingRope(4);
    }
    Map<Integer,Integer> map = new HashMap<>();
    public int cuttingRope(int n) {
        if (n == 2){
            return 1;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }
        int max = 0;
        for (int i = 1; i <= n; i++){
            max = Math.max(max,Math.max(i * (n-i),i * cuttingRope(n-i)));
        }
        map.put(n,max);
        return max;
    }
}
