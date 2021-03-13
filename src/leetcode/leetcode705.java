package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/13 12:04
 * @Version 1.0
 */
public class leetcode705 {
    class MyHashSet {
        int[] a;
        /** Initialize your data structure here. */
        public MyHashSet() {
            a = new int[1000001];
        }

        public void add(int key) {
          a[key] = 1;
        }

        public void remove(int key) {
            a[key] = 0;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return a[key] != 0;
        }

    }
}
