package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/6/19 15:53
 * @Version 1.0
 * 求众数||
 */
public class leetcode229 {
    public static void main(String[] args) {
        leetcode229 leetcode229 = new leetcode229();
        leetcode229.majorityElement(new int[] {3,2,3});
    }
    public List<Integer> majorityElement(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int cou1 = nums[0];
        int count1 = 0;
        int cou2 = nums[0];
        int count2 = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (cou1 == nums[i]) {
                count1 ++;
            }
            if (cou2 == nums[i]) {
                count2 ++;
            }
            if (cou1 == 0) {
                cou1 = nums[i];
                count1 ++;
            }
            if (cou2 == 0) {
                cou2 = nums[i];
                count2 ++;
            }
            cou1--;
            cou2--;
        }
        int x = 0;
        int y = 0;
        for (int a : nums) {
            if (a == cou1) {
                x++;
            }
            if (a == cou2) {
                y++;
            }
        }
        if (x > nums.length / 3) {
            list.add(cou1);
        }
        if (y > nums.length / 3) {
            list.add(cou2);
        }
        return list;
    }
}
