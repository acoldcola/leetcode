package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/9/10 9:19
 * @Version 1.0
 * 组合总和 II
 */
public class leetcode40 {
    public static void main(String[] args) {
        leetcode40 l = new leetcode40();
        l.combinationSum2(new int[]{10,1,2,7,6,1,5},8);
    }
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //排序剪枝
        Arrays.sort(candidates);
        dfs(0,new ArrayList<>(),target,candidates);
        List<List<Integer>> lists = new ArrayList<List<Integer>>(set);
        return lists;
    }

    private void dfs(int begin,List<Integer> list, int target, int[] candidates) {
        if (target == 0){
            set.add(new ArrayList<>(list));
            return;
        }
        for (int i = begin;i < candidates.length; i++){
            if (target < 0){
                break;
            }
            list.add(candidates[i]);
            dfs(i + 1,list,target - candidates[i],candidates);
            list.remove(list.size() - 1);
        }
    }
}
