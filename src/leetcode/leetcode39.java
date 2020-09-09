package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/9/3 16:12
 * 组合总和
 */
public class leetcode39 {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0,0,candidates,target,new ArrayList<>());
        return lists;
    }

    private void dfs(int begin,int sum, int[] candidates, int target, List<Integer> list) {
        if (sum > target){
            return;
        }
        if (sum == target){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = begin; i < candidates.length; i++){
            sum += candidates[i];
            list.add(candidates[i]);
            dfs(i,sum,candidates,target,list);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
