package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/2/20 12:43
 * @Version 1.0
 * 整数的各位积和之差
 */
public class leetcode1281 {
    public int subtractProductAndSum(int n) {
        int a = 1;
        int b = 0;
        while (n != 0) {
            a *= n%10;
            b += n%10;
            n/=10;
        }
        return a-b;
    }
}
