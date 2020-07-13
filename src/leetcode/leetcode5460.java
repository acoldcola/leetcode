package leetcode;

import com.sun.deploy.panel.ITreeNode;

/**
 * @Author ZhangKe
 * @Date 2020/7/12 10:30
 * @Version 1.0
 */
public class leetcode5460 {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0;i < nums.length -1;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }
}
