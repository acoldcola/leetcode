package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/3/20 15:48
 * @Version 1.0
 * 排列硬币
 */
public class leetcode441 {
    public int arrangeCoins(int n) {
        int i = 0;
        int num = 0;
        while (i <= n) {
            i=(i*(i+1))/2 ;
            num ++;
        }
        return num;
    }
}
