package leetcode;

import java.util.HashMap;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 23:02
 * @Version 1.0
 * 单词频率
 */
public class leetcode16_02 {
    private HashMap<String,Integer> hashMap = new HashMap<>();
    public leetcode16_02(String[] book) {
        for(String str : book) {
            hashMap.put(str,hashMap.getOrDefault(str,0) + 1);
        }
    }

    public int get(String word) {
        return hashMap.get(word) == null ? 0 : hashMap.get(word);
    }
}
