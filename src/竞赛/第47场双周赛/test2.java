package 竞赛.第47场双周赛;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/3/6 22:27
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        test2 l = new test2();
        l.checkPowersOfThree(21);
    }
    public boolean res = false;
    public boolean checkPowersOfThree(int n) {
        List<Integer> list = new ArrayList<>();
        int a = 1;
        while (a <= n) {
            list.add(a);
            a *= 3;
        }
        dfs(0,list,n,0);
        return res ;
    }

    public void dfs(int start,List<Integer> list, int n, int sum) {
        if (sum > n) {
            return;
        }
        if (sum == n) {
            res = true;
            return;
        }
        for (int i = start + 1; i < list.size(); i++) {
            dfs(i,list,n,sum + list.get(i));
        }
    }
}
