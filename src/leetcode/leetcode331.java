package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/3/12 13:46
 * @Version 1.0
 * 验证二叉树的前序序列化
 */
public class leetcode331 {
    public static boolean isValidSerialization(String preorder) {
        String[] str = preorder.split(",");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
            while (list.size() >= 3 && "#".equals(list.get(list.size() - 1))
                    && "#".equals(list.get(list.size() - 2)) && !"#".equals(list.get(list.size() - 3))) {
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                list.add("#");
            }
        }
        return list.size() == 1 && "#".equals(list.get(0));
    }
}
