package leetcode;

import javax.smartcardio.ResponseAPDU;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/10/15 21:20
 * @Version 1.0
 */
public class leetcode38 {
    public static void main(String[] args) {
        leetcode38 l = new leetcode38();
        l.countAndSay(5);
    }
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            int j = 0;
            StringBuilder res = new StringBuilder();
            while (j < sb.length()) {
                int x = j + 1;
                while (x < sb.length() && sb.charAt(j) == sb.charAt(x)) {
                    x++;
                }
                res.append(x-j).append(sb.charAt(j));
                j = x;
            }
            sb = res;
        }
        return sb.toString();
    }
}
