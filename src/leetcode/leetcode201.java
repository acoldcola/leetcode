package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/8/25 11:52
 * @Version 1.0
 */
public class leetcode201 {
    public int rangeBitwiseAnd(int m, int n) {
        int offet = 0;
        while (n > m){
            n >>= 1;
            m >>= 1;
            offet ++;
        }
        return m << offet;
    }

    /**
     * 第二种方法
     * @param m
     * @param n
     * @return
     */
    public int rangeBitwiseAndTWO(int m, int n) {
        while (n > m){
            n = n & (n - 1);
        }
        return n;
    }
}
