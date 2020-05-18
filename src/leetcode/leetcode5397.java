package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/16 22:36
 * @Version 1.0
 */
public class leetcode5397 {
    public static void main(String[] args) {
        leetcode5397  leetcode5397 = new leetcode5397();

        leetcode5397.simplifiedFractions(6);
    }
    public  List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        if (n == 1) {
            return list;
        }
        for (int i = 2; i <= n;i++) {
            for (int j = 1; j < i; j++) {
                if (j == 1) {
                    list.add(j+"/"+i);
                    continue;
                }
                int x = cal(i,j);
                // 计算是否有最小公倍数
                if (x != 0 && x != 1) {
                    continue;
                }
                if ((i % j) != 0) {
                    list.add(j+"/"+i);
                }
            }
        }
        return list;
    }
    int cal(int a, int b){
        return b == 0 ? a:cal(b, a%b);
    }
}
