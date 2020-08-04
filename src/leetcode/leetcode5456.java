package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/25 22:30
 * @Version 1.0
 */
public class leetcode5456 {
    public static void main(String[] args) {
        leetcode5456 l = new leetcode5456();
        l.countOdds(21,22);
    }
    public int countOdds(int low, int high) {
        int sum = high - low + 1;
        if (sum % 2 == 0) {
            return sum / 2;
        }
        if (low % 2 != 0 || high % 2 != 0) {
            return sum / 2 + 1;
        }else {
            return sum / 2;
        }
    }
}
