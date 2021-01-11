package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/10 10:30
 * @Version 1.0
 */
public class leetcode5649 {
    public int[] decode(int[] encoded, int first) {
        int res[] = new int[encoded.length + 1];
        res[0] = first;
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i-1] ^ encoded[i-1];
        }
        return res;
    }
}
