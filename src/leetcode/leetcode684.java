package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/13 17:29
 * @Version 1.0
 * 冗余连接
 */
public class leetcode684 {
    public int[] findRedundantConnection(int[][] edges) {
        int[] a = new int[edges.length + 1];
        for (int i = 1; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            if (find(edges[i][0],a) != find(edges[i][1],a)) {
                union(edges[i][0],edges[i][1],a);
            }else {
                return edges[i];
            }
        }
        return new int[0];
    }

    public void union(int x,int y, int[] nums) {
        nums[find(x,nums)] = find(y,nums);
    }
    public int find(int x, int[] nums) {
        if (x != nums[x]) {
            nums[x] = find(nums[x],nums);
        }
        return nums[x];
    }
}
