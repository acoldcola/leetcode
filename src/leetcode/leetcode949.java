package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/1/20 14:28
 * @Version 1.0
 */
public class leetcode949 {
    public List<List<Integer>> lists = new ArrayList<>();
    public  String largestTimeFromDigits(int[] arr) {
        boolean[] used = new boolean[arr.length];
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        dfs(used,arr,list);
        List<StringBuilder> sbList = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> list1 = lists.get(i);
            for (int j = 0; j < list1.size(); j++) {
                sb.append(list1.get(j));
                if (j == 1) {
                    sb.append(":");
                }
            }
            if (judge(sb)) {
                return sb.toString();
            }
        }
        return "";
    }

    public boolean judge(StringBuilder sb) {
        if (Integer.valueOf(sb.substring(0,1)) > 2) {
            return false;
        }
        if (sb.charAt(0) == '2' && Integer.valueOf(sb.substring(1,2)) >= 4) {
            return false;
        }
        if (Integer.valueOf(sb.substring(3,4)) > 5) {
            return false;
        }
        return true;
    }
    public  void dfs(boolean[] used, int[] arr, List<Integer> list) {
        if (list.size() == arr.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!used[i]) {
                list.add(arr[i]);
                used[i] = true;
                dfs(used,arr,list);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
