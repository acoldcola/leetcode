package leetcode;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author ZhangKe
 * @Date 2020/6/18 17:49
 * @Version 1.0
 * 独一无二的出现次数
 */
public class leetcode1207 {
    public static void main(String[] args) {
        leetcode1207 leetcode1207 = new leetcode1207();
        leetcode1207.uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
    }
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        boolean[] judge = new boolean[1000];
        for (int i = 0; i < arr.length; i++) {
            int sum = 1;
            while (i < arr.length && arr[i] == arr[i+1]) {
                i++;
                sum++;
            }
            if (!judge[sum]){
                judge[sum] = true;
            }else {
                return false;
            }
        }
        return true;
    }
}
