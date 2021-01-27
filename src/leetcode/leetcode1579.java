package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/27 17:27
 * @Version 1.0
 * 保证图可完全遍历
 */
public class leetcode1579 {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind a = new UnionFind(n);
        UnionFind b = new UnionFind(n);
        int res = 0;
        for (int i = 0; i < edges.length; i++) {
            if (edges[i][0] == 3) {
                if (!a.merge(edges[i][1]-1,edges[i][2]-1)) {
                    res++;
                }
                b.merge(edges[i][1]-1,edges[i][2]-1);
            }
        }
        for (int i = 0; i < edges.length; i++) {
            if (edges[i][0] == 1) {
                if (!a.merge(edges[i][1]-1,edges[i][2]-1)) {
                    res++;
                }
            }
            if (edges[i][0] == 2) {
                if (!b.merge(edges[i][1]-1,edges[i][2]-1)) {
                    res++;
                }
            }
        }
        if (a.count != 1 || b.count != 1) {
            return -1;
        }
        return res;
    }
}
