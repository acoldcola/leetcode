package 竞赛.第230场周赛;

/**
 * @Author ZhangKe
 * @Date 2021/3/1 14:02
 * @Version 1.0
 */
public class test2 {
    int res = Integer.MAX_VALUE;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        for (int i = 0; i < baseCosts.length; i++) {
            dfs(0,baseCosts[i],toppingCosts,target);
        }
        return res;
    }
    private void dfs(int i, int sum, int[] toppingCosts,int target) {
        if (sum == target) {
            res = sum;
            return;
        }
        if (Math.abs(res - target) > Math.abs(target - sum)) {
            res = sum;
        }
        if (Math.abs(res - target) == Math.abs(target - sum) && sum < res) {
            res = sum;
        }
        if (sum > target) {
            return;
        }
        if (i < toppingCosts.length) {
            dfs(i+1,sum,toppingCosts,target);
            dfs(i+1,sum + toppingCosts[i],toppingCosts,target);
            dfs(i+1,sum + toppingCosts[i] + toppingCosts[i],toppingCosts,target);
        }
    }
}
