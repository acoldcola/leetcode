package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 15:40
 * @Version 1.0
 * 下一个数
 */
public class interview05_04 {
    public static void main(String[] args) {
        findClosedNumbers(1);
    }
    public static int[] findClosedNumbers(int num) {
        if (num == 1) {
            return new int[] {2,-1};
        }
        return new int[] {num << 1, num >> 1};
    }
}
