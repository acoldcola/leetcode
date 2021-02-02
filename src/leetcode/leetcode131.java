package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/2/1 16:06
 * @Version 1.0
 */
public class leetcode131 {
    List<List<String>> lists = new ArrayList<>();
    public List<List<String>> partition(String s) {
        Deque<String> q = new ArrayDeque<>();
        dfs(0,s.length(),s,q);
        return lists;
    }

    public void dfs(int start, int length, String s, Deque<String> q) {
        if (start == s.length()) {
            lists.add(new ArrayList<>(q));
            return;
        }
        for (int i = start; i < length; i++) {
            if (!checkPalindromeString(start,i,s)) {
                continue;
            }
            q.add(s.substring(start,i+1));
            dfs(i+1,length,s,q);
            q.removeLast();
        }
    }

    public boolean checkPalindromeString(int left,int right,String s) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

