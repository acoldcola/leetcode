package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/18 15:03
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.minCount(new int[] {4,2,1}));
    }
    public int minCount(int[] coins) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
           int x = coins[i];
           while (coins[i] > 0) {
               coins[i] -= 2;
               count ++;
           }
        }
        return count;
    }
}
