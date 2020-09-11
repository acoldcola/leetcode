package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/9/4 16:31
 * @Version 1.0
 *  组合总和 III
 */
public class leetcode216 {
    public static void main(String[] args) {
        leetcode216 leetcode216 = new leetcode216();
        leetcode216.combinationSum3(3,9);
    }
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1,new ArrayList<>(),k,n);
        return lists;
    }

    public void dfs(int cur, List<Integer> list, int k, int n){
        if(list.size() == k){
            if (n == 0){
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = cur; i <= 9; i++){
            if (n - i < 0){
                break;
            }
            list.add(i);
            dfs(i + 1,list,k,n - i);
            list.remove(list.size() - 1);
        }
    }
}
