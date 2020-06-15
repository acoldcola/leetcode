package leetcode;

import java.util.zip.Inflater;

/**
 * @Author ZhangKe
 * @Date 2020/6/11 15:49
 * @Version 1.0
 * 重新规划路线
 */
public class leetcode1466 {
    public int minReorder(int n, int[][] connections) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int sum = 0;
        for (int i = 0; i < connections.length; i++) {
            if (connections[i][0] == 0) {
                sum++;
                int temp = connections[i][0];
                connections[i][0] = connections[i][1];
                connections[i][1] = temp;
            }
            merge(a,connections[i][0],connections[i][1]);
        }
        return 0;
    }
    public int find(int[] a, int root) {
        while (root != a[root]) {
            root = a[root];
        }
        return 0;
    }

    public void merge(int[] a, int x, int y) {
        int root1 = find(a,x);
        int root2 = find(a,y);
        if (root1 != root2) {
            a[root1] = root2;
        }
    }
}
