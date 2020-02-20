package leetcode;

import java.util.ArrayList;

/**
 * @Author ZhangKe
 * @Date 2020/2/20 11:53
 * @Version 1.0
 * 解压缩编码列表
 */
public class leetcode1313 {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length/2; i++) {
            for (int j = 0; j < nums[2*i]; j++) {
                list.add(nums[2*i+1]);
            }
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }
}
