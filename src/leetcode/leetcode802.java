package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/1/9 14:19
 * @Version 1.0
 */
public class leetcode802 {
    public static void main(String[] args) {
        eventualSafeNodes(new int[][]{{1,3,4,5},{},{},{},{},{2,4}});
    }
    public static List<Integer> eventualSafeNodes1(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        // 实现邻接矩阵
        int[][] a = new int[graph.length][graph.length];
        for (int i = 0; i < graph.length;i++) {
            for (int j = 0; j < graph[i].length; j++) {
                a[i][graph[i][j]] = 1;
            }
        }
        for (int k = 0; k < graph.length; k++) {
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph.length; j++) {
                    if (a[i][k] != 0 && a[k][j] != 0){
                        a[i][j] = 1;
                    }
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < graph.length; i++) {
            if (set.contains(i)) {
                continue;
            }
            if (a[i][i] == 1) {
                set.add(i);
                for (int j = 0; j < graph.length; j++) {
                    if (a[j][i] == 1){
                        set.add(j);
                    }
                }
            }
        }
        for (int i = 0; i < graph.length; i++) {
            if (!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        // 实现邻接矩阵
        int[][] a = new int[graph.length][graph.length];
        for (int i = 0; i < graph.length;i++) {
            for (int j = 0; j < graph[i].length; j++) {
                a[i][graph[i][j]] = 1;
            }
        }
        Set<Integer> allSet = new HashSet<>();
        for (int i = 0; i < graph.length; i++) {
            if (allSet.contains(i)) {
                list.add(i);
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            Set<Integer> set = new HashSet<>();
            boolean flag = true;
            while (!queue.isEmpty()) {
                int x = queue.poll();
                if (set.contains(x)) {
                    flag = false;
                    break;
                }
                set.add(x);
                for (int j = 0; j < graph.length; j++) {
                    if (a[x][j] == 1) {
                        if (!queue.contains(j)) {
                            queue.add(j);
                        }
                    }
                }
            }
            if (flag) {
                list.add(i);
                allSet.addAll(set);
            }
        }
        return list;
    }
}
