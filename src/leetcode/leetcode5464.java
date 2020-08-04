package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/19 10:31
 * @Version 1.0
 */
public class leetcode5464 {
    public static void main(String[] args) {
        leetcode5464 l = new leetcode5464();
        l.numWaterBottles(22 ,6);
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int x = numBottles / numExchange;
        int y = numBottles % numExchange;
        while (x + y > 0) {
            sum += x;
            if (x + y >= numExchange) {
                int p = x + y;
                x = p / numExchange;
                y = p % numExchange;
            }else {
                break;
            }
        }
        return sum;
    }
}