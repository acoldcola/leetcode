package leetcode;

import sun.misc.LRUCache;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/5/25 15:25
 * @Version 1.0
 * LRU缓存机制
 */
public class leetcode146 {
    public static void main(String[] args) {
        leetcode146 cache = new leetcode146( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }
    class DoubleNode {
        private Integer key;
        private Integer value;
        private DoubleNode prev;
        private DoubleNode next;
        public DoubleNode() {

        }
        public DoubleNode(int key,int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer,DoubleNode> catchMap = new HashMap<>();
    private Integer size,capacity;
    private DoubleNode head,tail;

    public leetcode146(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DoubleNode();
        tail = new DoubleNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (catchMap.containsKey(key)) {
            DoubleNode node = catchMap.get(key);
            moveToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        DoubleNode node = catchMap.get(key);
        if (node == null) {
            DoubleNode doubleNode = new DoubleNode(key,value);
            catchMap.put(key,doubleNode);
            addToHead(doubleNode);
            size ++;
            if (size > capacity) {
                catchMap.remove(removeTailNode().key);
                size--;
            }
        }else {
            node.value = value;
            moveToHead(node);
        }

    }

    public void addToHead(DoubleNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    public void removeNode(DoubleNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void moveToHead(DoubleNode node) {
        removeNode(node);
        addToHead(node);
    }
    public DoubleNode removeTailNode() {
        DoubleNode node = tail.prev;
        removeNode(node);
        return node;
    }
}
