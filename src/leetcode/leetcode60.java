package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/9/5 12:54
 * @Version 1.0
 * 第k个排列
 */
public class leetcode60 {
    List<String> list = new ArrayList<>();
    public String getPermutation(int n, int k) {
        if (n == 0){
            return new String();
        }
        boolean[] used = new boolean[n + 1];
        StringBuilder sb = new StringBuilder();
        dfs(sb,used,n);
        if (k > list.size()){
            return new String();
        }
        return list.get(k - 1);
    }

    private void dfs(StringBuilder sb, boolean[] used, int n) {
        if (sb.length() == n){
            list.add(sb.toString());
            return;
        }
        for(int i = 1; i <= n; i++){
            if(used[i]){
                continue;
            }else {
                used[i] = true;
                sb.append(i);
                dfs(sb,used,n);
                used[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
