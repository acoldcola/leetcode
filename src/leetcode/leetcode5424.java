package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/7/5 10:30
 * @Version 1.0
 */
public class leetcode5424 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int a  = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i-1] != a) {
                return false;
            }
        }
        return true;
    }
}
