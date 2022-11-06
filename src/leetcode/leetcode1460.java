package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2022/8/24 20:58
 * @Version 1.0
 */
public class leetcode1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
