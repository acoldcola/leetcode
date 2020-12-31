package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author ZhangKe
 * @Date 2020/12/30 18:07
 * @Version 1.0
 */
public class leetcode1707 {
    public static void main(String[] args) {
        leetcode1707 rankBus = new leetcode1707();
        rankBus.maximizeXor(new int[]{0, 1, 2, 3, 4}, new int[][]{{3, 1}, {1, 3}, {5, 6}});
    }

    public int[] maximizeXor(int[] nums, int[][] queries) {
        Trie trie = new Trie();
        Arrays.sort(nums);
        int[] res = new int[queries.length];
        Integer[] a = new Integer[queries.length];
        for (int i = 0; i < queries.length; i++) {
            a[i] = i;
        }
        Arrays.sort(a, Comparator.comparingInt(o -> queries[o][1]));
        int n = 0;
        for (int i = 0; i < queries.length; i++) {
            while (n < nums.length && nums[n] <= queries[a[i]][1]) {
                trie.insert(nums[n], trie);
                n++;
            }
            res[a[i]] = n == 0 ? -1 : trie.search(queries[a[i]][0], trie);
        }
        return res;
    }

    class Trie {
        public int val;
        public Trie[] next = new Trie[2];

        public void insert(int n, Trie root) {
            String str = Integer.toBinaryString(n);
            for (int i = 0; i < 32; i++) {
                // 高位补0
                char a = i >= 32 - str.length() ? str.charAt(i - (32 - str.length())) : '0';
                if (a == '0') {
                    if (root.next[0] == null) {
                        root.next[0] = new Trie();
                    }
                    root = root.next[0];
                } else {
                    if (root.next[1] == null) {
                        root.next[1] = new Trie();
                    }
                    root = root.next[1];
                }
            }
            root.val = n;
        }

        public int search(int m, Trie root) {
            String str = Integer.toBinaryString(m);
            for (int i = 0; i < 32; i++) {
                char a = i >= 32 - str.length() ? str.charAt(i - (32 - str.length())) : '0';
                if (a == '0') {
                    if (root.next[1] != null) {
                        root = root.next[1];
                    } else {
                        root = root.next[0];
                    }
                } else {
                    if (root.next[0] != null) {
                        root = root.next[0];
                    } else {
                        root = root.next[1];
                    }
                }
            }
            return root.val ^ m;
        }
    }
}
