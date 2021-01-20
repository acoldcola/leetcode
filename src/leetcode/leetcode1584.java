package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/1/20 10:52
 * @Version 1.0
 * 连接所有点的最小费用
 */
public class leetcode1584 {
    public static void main(String[] args) {
        leetcode1584 l = new leetcode1584();
        l.minCostConnectPoints(new int[][] {{0,0},{2,2},{3,10},{5,2},{7,0}});
    }
    public int minCostConnectPoints(int[][] points) {
        int res = 0;
        List<Edge> list = new ArrayList<Edge>();
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int length = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                System.out.println(length);
                Edge edge = new Edge(i, j, length);
                list.add(edge);
            }
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.length));
        UnionFind unionFind = new UnionFind(points.length);
        int n = 1;
        for (int i = 0; i < list.size(); i++) {
            Edge edge = list.get(i);
            if (unionFind.merge(edge.x, edge.y)) {
                res += edge.length;
                n++;
                if (n == points.length) {
                    break;
                }
            }
        }
        return res;
    }
}

class Edge {
    int x;
    int y;
    int length;

    Edge(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }
}

class UnionFind {
    int[] pre;
    int[] rank;
    int n;

    UnionFind(int n) {
        this.n = n;
        rank = new int[n];
        Arrays.fill(rank, 1);
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
        return pre[x];
    }

    // 合并集合
    public boolean merge(int x, int y) {
        int fx = find(x), fy = find(y);
        if (fx == fy) {
            return false;
        }
        if (rank[fx] > rank[fy]) {
            pre[fy] = fx;
        } else {
            if (rank[fx] == rank[fy]) {
                rank[fy]++;
            }
            pre[fx] = fy;
        }
        return true;
    }
}

