package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/9/4 17:36
 * 组合
 */
public class leetcode77 {
    public static void main(String[] args) {
        leetcode77 leetcode77 = new leetcode77();
        leetcode77.combine(4,2);
    }
    public  List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if (k > n) {
            return null;
        }
        boolean[] used = new boolean[n+1];
        dfs(1,new ArrayList<>(),k,n);
        System.out.println(list);
        return list;
    }
    public void dfs(int begin,List<Integer> res,int k,int n) {
        if (res.size() == k) {
            list.add(new ArrayList<>(res));
            return;
        }
        for (int i = begin; i <= n; i++) {
                res.add(i);
                dfs(i+1,res,k,n);
                res.remove(res.size() - 1);
        }
    }
}
