package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2022/8/16 22:32
 * @Version 1.0
 * 设计有序流
 */
public class leetcode1656 {
    public static void main(String[] args) {
        leetcode1656 os= new leetcode1656(5);
        os.insert(3, "ccccc"); // 插入 (3, "ccccc")，返回 []
        os.insert(1, "aaaaa"); // 插入 (1, "aaaaa")，返回 ["aaaaa"]
        os.insert(2, "bbbbb"); // 插入 (2, "bbbbb")，返回 ["bbbbb", "ccccc"]
        os.insert(5, "eeeee"); // 插入 (5, "eeeee")，返回 []
        os.insert(4, "ddddd");
    }
    public int pr = 1;
    public String[] str;
    public leetcode1656(int n) {
        str = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
        str[idKey] = value;
        List<String> res = new ArrayList<>();
        while (pr < str.length && str[pr] != null) {
            res.add(str[pr++]);
        }
        return res;
    }
}
