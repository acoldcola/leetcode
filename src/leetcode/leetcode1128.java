package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/1/26 10:54
 * @Version 1.0
 * 等价多米诺骨牌对的数量
 */
public class leetcode1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        if (dominoes.length == 1) {
            return 0;
        }
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++) {
            String a = "" + dominoes[i][0] + dominoes[i][1];
            String b = "" + dominoes[i][1] + dominoes[i][0];
            if (map.containsKey(a)) {
                map.put(a,map.get(a) + 1);
            }else if (map.containsKey(b)) {
                map.put(b,map.get(b) + 1);
            }else {
                map.put(a,1);
            }
        }
        int res = 0;
        for (String str : map.keySet()) {
            int x = map.get(str);
            if (x >= 2) {
                res += x * (x-1) / 2;
            }
        }
        return res;
    }
}
