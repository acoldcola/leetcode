package 竞赛.第48场双周赛;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/3/20 22:26
 * @Version 1.0
 */
public class test3 {
    public static void main(String[] args) {
        test3 l = new test3();
        l.getMaximumConsecutive(new int[] {1,1,1,4});
    }
    public int sum = 0;
    public List<Integer> list = new ArrayList<>();
    public int getMaximumConsecutive(int[] coins) {
        dfs(coins,0,0);
        int res = 0;
        List<Integer> s = new ArrayList<>();
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i-1))) {
                continue;
            }
            if (list.get(i) == list.get(i - 1) + 1) {
                res++;
            }else {
                s.add(res);
                res = 0;
            }
        }
        s.add(res);
        Collections.sort(s);
        return s.get(s.size() - 1);
    }

    public void dfs(int[] coins,int index,int sum) {
        list.add(sum);
        for (int i = index; i < coins.length; i++) {
            dfs(coins, i + 1,sum + coins[i]);
        }
    }
}
