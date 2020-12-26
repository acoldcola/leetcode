package 模板;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @Author ZhangKe
 * @Date 2020/12/25 17:10
 * @Version 1.0
 * 并查集模板
 */
public class UnionFind {
    public int[] pre = new int[1000];

    // 找到父节点
    public int find(int x) {
        if (x != pre[x]) {
            // 使用递归进行路径压缩
            pre[x] = find(pre[x]);
        }
        return x;
    }

    // 合并集合
    public void merge(int x, int y) {
        int a = find(x);
        int b = find(y);
        if (a != b) {
            pre[a] = b;
        }
    }
}
