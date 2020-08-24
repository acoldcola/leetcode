package leetcode;

import java.util.HashMap;

/**
 * @Author ZhangKe
 * @Date 2020/8/24 18:09
 * @Version 1.0
 * 键值映射
 */
public class leetcode677 {
    private HashMap<String, Integer> map = null;
    public leetcode677() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for(String key : map.keySet()){
            if (key.startsWith(prefix)){
                sum += map.get(key);
            }
        }
        return sum;
    }
}
