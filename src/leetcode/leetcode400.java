package leetcode;

/**
 * @Author ZhangKe
 * @Date 2022/8/11 23:25
 * @Version 1.0
 */
public class leetcode400 {
    public static void main(String[] args) {
        leetcode400 leetcode400 = new leetcode400();
        Integer res = leetcode400.findNthDigit(1000000000);
        System.out.println(res);
    }
    public int findNthDigit(int n) {
        if (n  < 10) {
            return n;
        }
        int dig = 1;
        long start = 1;
        long count = dig * 9 * start;
        while (n > count) {
            n -= count;
            dig++;
            start *= 10;
            count = dig * 9 * start;
        }
        long num = start + (n - 1) / dig;
        int flag = (n - 1) % dig;
        String res = String.valueOf(num);
        return res.charAt(flag) - '0';
    }
}
