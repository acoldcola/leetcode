package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.Inflater;

/**
 * @Author ZhangKe
 * @Date 2020/6/11 15:49
 * @Version 1.0
 * 重新规划路线
 */
public class leetcode1466 {
    public int minReorder(int n, int[][] connections) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int res = 0;
        while (set.size()!=n) {
            for (int i = 0; i < connections.length; i++) {
                if (set.contains(connections[i][1])){
                    set.add(connections[i][0]);
                }else {
                    res++;
                    set.add(connections[i][1]);
                }
            }
        }
        return res;
    }
}
