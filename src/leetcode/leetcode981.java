package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/7/10 18:12
 * @Version 1.0
 */
public class leetcode981 {
    class A {
        private String value;
        private Integer timestamp;
        A(String value, Integer timestamp) {
            this.timestamp = timestamp;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Integer getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }
    }
    Map<String, Queue<A>> map;
    /** Initialize your data structure here. */
    public leetcode981() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        A a = new A(value,timestamp);
        if (map.containsKey(key)) {
            Queue<A> list = map.get(key);
            list.add(a);
            map.put(key,list);
        }else {
            Queue<A> list = new PriorityQueue<>((o1,o2) -> o2.getTimestamp() - o1.getTimestamp());
            list.add(a);
            map.put(key,list);
        }
    }

    public String get(String key, int timestamp) {
        if (map.containsKey(key)) {
            Queue<A> queue = map.get(key);
            if (queue.peek().getTimestamp() > timestamp) {
                return "";
            }
            List<A> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                A a = queue.poll();
                list.add(a);
                if (a.getTimestamp() <= timestamp) {
                    for (int i = 0; i < list.size(); i++) {
                        queue.add(list.get(i));
                    }
                    return a.getValue();
                }
            }
            for (int i = 0; i < list.size(); i++) {
                queue.add(list.get(i));
            }
        }
        return "";
    }
}
