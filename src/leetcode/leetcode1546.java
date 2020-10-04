package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/29 17:46
 * @Version 1.0
 * 和为目标值的最大数目不重叠非空子数组数目
 */
public class leetcode1546 {
    public static void main(String[] args) {
        leetcode1546 l = new leetcode1546();
        l.maxNonOverlapping(new int[]{1,1,1,1,1},2);
    }
    int cur = 0;
    int sum = 0;
    public int maxNonOverlapping(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        dfs(cur,nums,target);
        return sum;
    }

    private void dfs(int x, int[] nums, int target) {
        if (target <= 0){
            if (target == 0){
                cur = x;
                sum ++;
            }
            return;
        }
        for (int i = x; x < nums.length; x++){
            dfs(i + 1,nums,target-nums[i]);
        }
    }
}

