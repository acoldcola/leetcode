package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/3 11:11
 * @Version 1.0
 */
public class leetcode5401 {
    public static void main(String[] args) {
        kLengthApart(new int[] {1,0,0,0,1,0,0,1},2);
    }
    public static boolean kLengthApart(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length-1;i++) {
            if (nums[i] == 1) {
                int size = 0;
                while (i < nums.length-1 && nums[++i] == 0) {
                    size++;
                }
                list.add(size);
                i -= 1;
            }
        }
        for (int x : list) {
            if (x < k) {
                return false;
            }
        }
        return true;
    }
}
