package 竞赛.第44场双周赛;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/1/23 22:29
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        decode(new int[]{3,1});
    }
    public static int[] decode(int[] encoded) {
        int left = encoded[0];
        int right = encoded[1];
        int all = encoded[0] ^ encoded[1];
        int a = 0;
        boolean flag = false;
        for (int i = 1; i < 10000; i++) {
            for (int j = 1; j < 10000; j++) {
                for (int k = 1; k < 10000; k++) {
                    if (((i ^ j) == left) && ((j ^ k) == right) && ((i ^ k) == all)) {
                        a = i;
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        int[] res = new int[encoded.length + 1];
        res[0] = a;
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1] ^ encoded[i - 1];
        }
        return res;
    }
}
