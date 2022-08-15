package leetcode;

/**
 * @Author ZhangKe
 * @Date 2022/8/15 22:33
 * @Version 1.0
 * 设计循环双端队列
 */
public class leetcode641 {
    public static void main(String[] args) {
        leetcode641 circularDeque = new leetcode641(3); // 设置容量大小为3
        circularDeque.insertLast(1);			        // 返回 true
        circularDeque.insertLast(2);			        // 返回 true
        circularDeque.insertFront(3);			        // 返回 true
        circularDeque.insertFront(4);			        // 已经满了，返回 false
        circularDeque.getRear();  				// 返回 2
        circularDeque.isFull();				        // 返回 true
        circularDeque.deleteLast();			        // 返回 true
        circularDeque.insertFront(4);			        // 返回 true
        circularDeque.getFront();
    }
    ListNode head = new ListNode();
    ListNode tail = new ListNode();
    public Integer count = 0;
    public Integer size;
    class ListNode {
        ListNode pre;
        ListNode next;
        Integer value;
    }

    public leetcode641(int k) {
        size = k;
    }

    public boolean insertFront(int value) {
        if (count == 0) {
            ListNode listNode = new ListNode();
            listNode.value = value;
            head = listNode;
            tail = listNode;
            count++;
            return true;
        }else if (count == size) {
            return false;
        }else {
            ListNode listNode = new ListNode();
            listNode.value = value;
            head.pre =listNode;
            listNode.next = head;
            head = listNode;
            count++;
            return true;
        }
    }

    public boolean insertLast(int value) {
        if (count == 0) {
            ListNode listNode = new ListNode();
            listNode.value = value;
            head = listNode;
            tail = listNode;
            count++;
            return true;
        }else if (count == size) {
            return false;
        }else {
            ListNode listNode = new ListNode();
            listNode.value = value;
            tail.next= listNode;
            listNode.pre = tail;
            tail = listNode;
            count++;
            return true;
        }
    }

    public boolean deleteFront() {
        if (count == 0) {
            return false;
        }else if (count == 1){
            head = null;
            tail = null;
            count--;
            return true;
        }else {
            head.next.pre = null;
            head = head.next;
            count--;
            return true;
        }
    }

    public boolean deleteLast() {
        if (count == 0) {
            return false;
        }else if (count == 1){
            head = null;
            tail = null;
            count--;
            return true;
        }else {
            tail.pre.next = null;
            tail = tail.pre;
            count -- ;
            return true;
        }
    }

    public int getFront() {
        if (count == 0) {
            return -1;
        }else {
            return head.value;
        }
    }

    public int getRear() {
        if (count == 0) {
            return -1;
        }else {
            return tail.value;
        }
    }

    public boolean isEmpty() {
        return count==0;
    }

    public boolean isFull() {
        return count==size;
    }
}
