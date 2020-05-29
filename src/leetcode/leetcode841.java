package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/29 17:04
 * @Version 1.0
 * 钥匙和房间
 */
public class leetcode841 {
    public static void main(String[] args) {
        leetcode841 leetcode841 = new leetcode841();
        List<List<Integer>> list = new ArrayList<>();
        leetcode841.canVisitAllRooms(list);
    }
    public int[] a;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        a = new int[rooms.size()];
        dfs(rooms,0);
        for (int i = 0; i < a.length;i++) {
            if (a[i] < 1){
                return false;
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> list,int i) {
        if (a[i] > 0) {
            return;
        }
        a[i] ++;
        for (int j = 0; j < list.get(i).size();j++) {
            dfs(list,list.get(i).get(j));
        }
    }
}
