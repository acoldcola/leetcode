package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/6/30 17:10
 * @Version 1.0
 * 汇总区间
 */
public class leetcode228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        if (nums.length == 1){
            list.add(nums[0]+"");
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j + 1] - nums[j] != 1) {
                if (i == j) {
                    list.add(nums[i]+"");
                }else {
                    list.add(nums[i] + "->" + nums[j]);
                }
                if (j == nums.length - 2) {
                    list.add(nums[j+1]+"");
                    break;
                }
                i = j+1;
            }
            if (nums.length - 2 == j) {
                list.add(nums[i] + "->" + nums[j + 1]);
                break;
            }
        }
        return list;
    }
}
