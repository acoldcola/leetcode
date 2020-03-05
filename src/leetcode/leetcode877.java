package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/3/5 10:14
 * @Version 1.0
 * 石子游戏
 */
public class leetcode877 {
    public static void main(String[] args) {
        int[] x = {5, 3, 4, 5};
        stoneGame(x);
    }
    public static boolean stoneGame(int[] piles) {
        int x = piles.length/2;
        int a = 0;
        int b = 0;
        for(int i = x-1,j = x; i >=0 && j < piles.length; i--,j++) {
            a += Math.max(piles[i],piles[j]);
            b += Math.min(piles[i],piles[j]);
        }
        if (a > b) {
            return true;
        }else {
            return false;
        }
    }
}
