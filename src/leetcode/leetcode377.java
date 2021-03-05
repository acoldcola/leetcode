package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/3/5 10:50
 * @Version 1.0
 * 组合总和 Ⅳ
 */
public class leetcode377 {
    //    public int res = 0;
//    public int combinationSum4(int[] nums, int target) {
//        dfs(0,nums,target);
//        return res;
//    }
//
//    private void dfs(int sum,int[] nums, int target) {
//        if (sum == target) {
//            res++;
//            return;
//        }
//        if (sum > target) {
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            dfs(sum + nums[i],nums,target);
//        }
//    }

    public static void main(String[] args) {
        combinationSum4(new int[] {1,2,3},4);
    }
    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                dp[nums[i]] = 1;
            }
        }
        for (int i = 0;i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i > nums[j]) {
                    dp[i]+= dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
