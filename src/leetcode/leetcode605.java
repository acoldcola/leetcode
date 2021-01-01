package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/1 17:20
 * @Version 1.0
 * 种花问题
 */
public class leetcode605 {
    public static void main(String[] args) {
        canPlaceFlowers(new int[]{1,0,0,0,0,1},2);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || n > flowerbed.length) {
            return false;
        }
        int size = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0 && (i >= flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    n--;
                    continue;
                }
                size++;
                if (size == 2) {
                   if(i >= flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                       n--;
                       if (n == 0) {
                           return true;
                       }
                   }
                    size = 0;
                }
            }else {
                size = 0;
            }
        }
        return n == 0;
    }
}
