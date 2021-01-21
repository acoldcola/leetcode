package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/1/21 11:03
 * @Version 1.0
 * 找到最小生成树里的关键边和伪关键边
 */
public class leetcode1489 {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        List<NewEdge> list = new ArrayList<NewEdge>();
        for (int i = 0; i < edges.length; i++) {
            NewEdge newEdge = new NewEdge(edges[i][0],edges[i][1],edges[i][2],i);
            list.add(newEdge);
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.length));
        // 求出最小生成树的权值
        int sum = 0;
        int NUMBER_OF_EDGES = 1;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < list.size(); i++) {
            NewEdge newEdge = list.get(i);
            if (unionFind.merge(newEdge.x,newEdge.y)) {
                sum += newEdge.length;
                NUMBER_OF_EDGES ++;
                if (NUMBER_OF_EDGES == n) {
                    break;
                }
            }
        }
        List<Integer> key = new ArrayList<>();
        List<Integer> fakeKey = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            // 删除一条边，并且最小生成树的权值大于原来最小生成树的权值，那么这条边就是关建边
            unionFind = new UnionFind(n);
            int value = 0;
            NUMBER_OF_EDGES = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                NewEdge newEdge = list.get(j);
                if (unionFind.merge(newEdge.x,newEdge.y)) {
                    value += newEdge.length;
                    NUMBER_OF_EDGES ++;
                    if (NUMBER_OF_EDGES == n) {
                        break;
                    }
                }
            }
            if (NUMBER_OF_EDGES != n || (NUMBER_OF_EDGES == n && value > sum)) {
                key.add(list.get(i).index);
                continue;
            }
            value = 0;
            NUMBER_OF_EDGES = 1;
            unionFind = new UnionFind(n);
            NewEdge newEdge = list.get(i);
            // 将这条边加入最小生成树，如果得出的权值和原来的权值，就是伪关键边
            unionFind.merge(newEdge.x,newEdge.y);
            value += newEdge.length;
            NUMBER_OF_EDGES++;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                newEdge = list.get(j);
                if (unionFind.merge(newEdge.x,newEdge.y)) {
                    value += newEdge.length;
                    NUMBER_OF_EDGES ++;
                    if (NUMBER_OF_EDGES == n) {
                        break;
                    }
                }
            }
            if (value == sum) {
                fakeKey.add(list.get(i).index);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(key);
        res.add(fakeKey);
        return res;
    }
}
class NewEdge {
    int x;
    int y;
    int length;
    int index;
    NewEdge(int x, int y, int length, int index) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.index = index;
    }
}

