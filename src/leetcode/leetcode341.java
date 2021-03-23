package leetcode;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/3/23 16:04
 * @Version 1.0
 * 扁平化嵌套列表迭代器
 */
public class leetcode341 {
    public interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.

        public boolean isInteger();
        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list

        public Integer getInteger();
        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer

        public List<NestedInteger> getList();
    }
    public class NestedIterator implements Iterator<Integer> {
        Deque<Integer> deque = new LinkedList<>();
        public NestedIterator(List<NestedInteger> nestedList) {
            add(nestedList);
        }

        public void add(List<NestedInteger> nestedList) {
            for (NestedInteger n : nestedList) {
                if (n.isInteger()) {
                    deque.add(n.getInteger());
                }else {
                    add(n.getList());
                }
            }
        }
        @Override
        public Integer next() {
            return deque.pollFirst();
        }

        @Override
        public boolean hasNext() {
            return !deque.isEmpty();
        }
    }
}
