package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/8/15 13:42
 * 汉明距离
 */
public class leetcode461 {
    public int hammingDistance(int x, int y) {
        // 先异或得出不相同个数，在二进制中表现为1
        int m = x ^ y;
        int count = 0;
        // 求有多少个1
        while (m != 0) {
            m = m & (m-1);
            count++;
        }
        return count;
    }
}
