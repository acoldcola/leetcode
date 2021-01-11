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
        l.findCircleNum(new int[][]{{1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0}, {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0}, {1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0}, {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0}, {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0}, {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}});
    }

    public int findCircleNum(int[][] isConnected) {
        int[] a = new int[isConnected.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = i + 1; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    a[find(i, a)] = a[find(j, a)];
                }
            }
        }
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == i) {
                res++;
            }
        }
        return res;
    }

    // 使用递归方式进行路径压缩，不能使用迭代方式进行路径压缩，不能一次性把路径压缩完成
    public int find(int i, int[] a) {
        if (i != a[i]) {
            a[i] = find(a[i], a);
        }
        return a[i];
    }
}
