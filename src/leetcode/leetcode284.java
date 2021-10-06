package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/10/5 10:17
 * @Version 1.0
 */
public class leetcode284 implements Iterator<Integer>{
    int sub;
    int size;
    List<Integer> list;
    public leetcode284(Iterator<Integer> iterator) {
        // initialize any member here.
        list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        sub = 0;
        size = list.size();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return list.get(sub);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return list.get(sub++);
    }

    @Override
    public boolean hasNext() {
        return sub < size;
    }
}
