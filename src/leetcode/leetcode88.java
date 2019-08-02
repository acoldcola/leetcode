package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/8/2 17:00
 * 合并两个有序的数组
 */
public class leetcode88 {
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length - nums2.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
    }
}
