package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/1/14 9:29
 * @Version 1.0
 * 可被 5 整除的二进制前缀
 */
public class leetcode1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum * 2 + A[i];
            sum %= 5;
            if (sum == 0) {
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }
}
