package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/11 23:21
 * @Version 1.0
 */
public class leetcode5447 {
    public static void main(String[] args) {
        leetcode5447 leetcode5447 = new leetcode5447();
        leetcode5447.winnerSquareGame(8);
    }
    public boolean winnerSquareGame(int n) {
        int a = n / 2 + 1;
        int res = 0;
        for (int i = a; i > 0; i--) {
            System.out.println(i);
            if (i * i <= n) {
                n -= i * i;
                res ++;
                i = n / 2 + 2;
            }
        }
        double x = Math.sqrt(n) * Math.sqrt(n);
        boolean judge = x -n == 0;
        return res % 2 == 0 || judge;
    }
}
