package 模板;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/12/25 17:10
 * @Version 1.0
 * 并查集模板
 */
public class UnionFind {
    int[] pre;
    int[] rank;
    int n;

    UnionFind(int n) {
        this.n = n;
        rank = new int[n];
        Arrays.fill(rank,1);
        pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
        }
    }
    // 找到父节点
    public int find(int x) {
        if (x != pre[x]) {
            // 使用递归进行路径压缩
            pre[x] = find(pre[x]);
        }
        return x;
    }

    // 合并集合
    public boolean merge(int x, int y) {
        int fx = find(x), fy = find(y);
        if (fx == fy) {
            return false;
        }
        if (rank[fx] > rank[fy]) {
            pre[fy] = fx;
        }else {
            if (rank[fx] == rank[fy]) {
                rank[fy]++;
            }
            pre[fx] = fy;
        }
        return true;
    }
}
