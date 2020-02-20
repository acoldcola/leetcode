package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/2/20 11:18
 * @Version 1.0
 * 将数字变成 0 的操作次数
 */
public class leetcode1342 {
    public int numberOfSteps (int num) {
        if (num == 0) {
            return 0;
        }
        int i = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            }else {
                num = num - 1;
            }
            i++;
        }
        return i;
    }
}
