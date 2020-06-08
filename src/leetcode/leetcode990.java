package leetcode;

import sun.reflect.FieldInfo;

import java.util.HashSet;

/**
 * @Author ZhangKe
 * @Date 2020/6/8 9:46
 * @Version 1.0
 *  等式方程的可满足性
 */
public class leetcode990 {
    public static void main(String[] args) {
        leetcode990 l = new leetcode990();
        l.equationsPossible(new String[] {"a==b","b!=a"});
    }
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < equations.length; i++) {
            char[] chars = equations[i].toCharArray();
            if (chars[1] == '=') {
                int index1 = chars[0] - 'a';
                int index2 = chars[3] - 'a';
                merge(parent,index1,index2);
            }
        }
        for (int i = 0; i < equations.length; i++) {
            char[] chars = equations[i].toCharArray();
            if (chars[1] == '!') {
                int index1 = chars[0] - 'a';
                int index2 = chars[3] - 'a';
                if (find(parent,index1) == find(parent,index2)) {
                    return false;
                }
            }
        }
        return true;
    }
    public void merge(int[] parent,int index1, int index2) {
        parent[find(parent,index1)] = find(parent,index2);
    }

    public int find(int[] parent, int root) {
        while (root != parent[root]){
            parent[root] = parent[parent[root]];
            root = parent[root];
        }
        return root;
    }
}
