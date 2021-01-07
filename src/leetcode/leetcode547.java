package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2021/1/7 14:12
 * @Version 1.0
 * 省份数量
 */
public class leetcode547 {
    public static void main(String[] args) {
        leetcode547 l = new leetcode547();
        l.findCircleNum(new int[][] {{1,0,0,0,1,1,0,1,0,0,0,1,0,0,0},{0,1,0,0,1,0,1,0,0,0,0,0,0,0,0},{0,0,1,0,1,0,0,0,0,0,0,0,1,1,0},{0,0,0,1,0,0,0,0,0,0,0,1,1,1,0},{1,1,1,0,1,0,0,0,0,0,1,0,0,0,0},{1,0,0,0,0,1,0,0,0,1,0,0,0,0,0},{0,1,0,0,0,0,1,0,1,0,0,0,0,0,0},{1,0,0,0,0,0,0,1,0,0,0,0,0,0,0},{0,0,0,0,0,0,1,0,1,0,0,0,0,0,1},{0,0,0,0,0,1,0,0,0,1,0,0,0,0,0},{0,0,0,0,1,0,0,0,0,0,1,0,0,1,0},{1,0,0,1,0,0,0,0,0,0,0,1,1,0,0},{0,0,1,1,0,0,0,0,0,0,0,1,1,0,0},{0,0,1,1,0,0,0,0,0,0,1,0,0,1,0},{0,0,0,0,0,0,0,0,1,0,0,0,0,0,1}});
    }
    public int findCircleNum(int[][] isConnected) {
        int[] a = new int[isConnected.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = i + 1; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    if (a[i] != i) {
                        a[find(i, a)] = a[j];
                    } else {
                        a[i] = a[j];
                    }
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length;i++) {
            set.add(find(i,a));
        }
        return set.size();
    }

    public int find(int i, int[] a) {
        while (a[i] != i) {
            a[i] = a[a[i]];
            i = a[i];
        }
        return i;
    }
}
