package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/13 15:08
 * @Version 1.0
 * 找出数组中的幸运数
 */
public class leetcode1394 {
    public int findLucky(int[] arr) {
        int[] sum = new int[500];
        for (int i = 0; i < arr.length; i++) {
            sum[arr[i]] ++;
        }
        int max = -1;
        for (int i = 1; i < sum.length; i++) {
            if (sum[i] == i && sum[i] > max) {
               max = sum[i];
            }
        }
        return max;
    }
}
