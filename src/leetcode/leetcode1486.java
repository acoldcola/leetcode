package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/1 21:14
 * @Version 1.0
 * 数组异或操作
 */
public class leetcode1486 {
    public int xorOperation(int n, int start) {
        int res = 0;
        for(int i = 0; i < n;i++) {
            res ^= start + 2 * i;
        }
        return res;
    }
}
