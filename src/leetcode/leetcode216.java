package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.XMLFormatter;

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
    List<List<Integer>> lists = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 9; i++){
            dfs(k,n,list,i);
        }
        return lists;
    }

    private void dfs(int k, int n, List<Integer> list, int i) {
        if (list.size() == k && n != 0){
            return;
        }
        if (list.size() == k && n == 0){
            lists.add(new ArrayList<Integer>(list));
            return;
        }
        n -= i;
        list.add(i);
        int x = i + 1;
        for (; x <= 9; x++){
            dfs(k,n,list,x);
        }
        n += i;
        list.remove(list.size() - 1);
    }
}
