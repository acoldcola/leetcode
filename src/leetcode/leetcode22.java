package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/9/2 16:50
 * 括号生成
 */
public class leetcode22 {
    List<String> strings = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n,n,"");
        return strings;
    }
    public void dfs(int left,int right,String str) {
        if (left == 0 && right == 0) {
            strings.add(str);
            return;
        }
        if (left > 0) {
            dfs(left - 1,right,str + "(");
        }
        if (right > left) {
            dfs(left,right - 1,str + ")");
        }
    }
}
