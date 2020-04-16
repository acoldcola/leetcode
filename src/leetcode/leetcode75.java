package leetcode;

import com.sun.deploy.panel.ITreeNode;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 16:09
 * @Version 1.0
 * 颜色分类
 */
public class leetcode75 {
    public void sortColors(int[] nums) {
        int left = -1;
        int cur = 0;
        int right = nums.length;
        while (cur < right) {
            if (nums[cur] < 1) {
                swap(nums,cur++,++left);
            }else if(nums[cur] == 1) {
                cur++;
            }else {
                swap(nums,cur,--right);
            }
        }
    }
    public void swap(int[] nums,int a ,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
