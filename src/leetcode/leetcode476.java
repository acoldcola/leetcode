package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/3/25 18:50
 * 数字的补数
 */
public class leetcode476 {
    public static void main(String[] args) {
        findComplement(5);
    }

    public static int findComplement(int num) {
        int res = num;
        int x = 0;
        while (res > 0) {
            res >>= 1;
            x = x << 1 + 1;
        }
        return num ^ x;
    }
}
