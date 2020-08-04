package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/25 22:45
 * @Version 1.0
 */
public class leetcode5457 {
    public int numOfSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            arr[i] %= arr[i];
        }
        for (int i = 0; i < arr.length;i++) {
            int count = 0;
            int j = i;
            while (j < arr.length) {
                count += arr[j++];
                if (count % 2 != 0) {
                    sum++;
                    sum %= 1000000007;
                }
            }
        }
        return sum;
    }
}
