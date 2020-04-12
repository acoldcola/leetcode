package leetcode;

import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/12 17:01
 * @Version 1.0
 * 数据流的中位数
 */
public class leetcode295 {
    public static void main(String[] args) {
        leetcode295 l = new leetcode295();
        l.addNum(-1);
        l.addNum(-2);
        l.addNum(-3);
        l.addNum(-4);
        l.addNum(-5);
        System.out.println(l.findMedian());
    }
    private List<Integer> a = null;
    private List<Integer> b = null;
    public leetcode295() {
        this.a = new ArrayList<>();
        this.b = new ArrayList<>();
    }

    public void addNum(int num) {
        if (a.size() == 0) {
            a.add(num);
        }else {
            if (num > a.get(0)) {
                b.add(num);
                if (b.size() != 1) {
                    littleHeapInsert(b,b.size()-1);
                }
            }else {
                a.add(num);
                bigHeapInsert(a,a.size()-1);
            }
            if (a.size() - b.size() > 1) {
                Collections.swap(a,0,a.size()-1);
                b.add(a.get(a.size() - 1));
                if (b.size() != 1) {
                    littleHeapInsert(b,b.size()-1);
                }
                a.remove(a.size() - 1);
                bigHeapify(a,0,a.size());
            }
            if (b.size() - a.size() > 1) {
                Collections.swap(b,0,b.size()-1);
                a.add(b.get(b.size() -1));
                bigHeapInsert(a,a.size()-1);
                b.remove(b.size() - 1);
                littleHeapify(b,0,b.size());
            }
        }
    }

    public double findMedian() {
        if (a.size() > b.size()) {
            return a.get(0);
        }else if (b.size() > a.size()) {
            return b.get(0);
        }else {
            double x = (Double.valueOf(a.get(0)) + Double.valueOf(b.get(0)))/2;
            return x;
        }
    }
    // 生成大根堆
    public void bigHeapInsert(List<Integer> list,int index) {
        while (list.get(index) > list.get((index-1)/2)) {
            Collections.swap(list,index,(index-1)/2);
            index = (index-1)/2;
        }
    }
    // 生成小根堆
    public void littleHeapInsert(List<Integer> list,int index) {
        while (list.get(index) < list.get((index-1)/2)) {
            Collections.swap(list,index,(index-1)/2);
            index = (index-1)/2;
        }
    }
    // 维持大根堆
    public void bigHeapify(List<Integer> list,int index,int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int mid = left + 1 < heapSize && list.get(left) < list.get(left + 1)
                    ? left + 1 : left;
            mid = list.get(index) > list.get(mid) ? index : mid;
            if (index == mid) {
                break;
            }
            Collections.swap(list,index,mid);
            index = mid;
            left = index * 2 + 1;
        }
    }
    // 维持小根堆
    public void littleHeapify(List<Integer> list,int index,int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int mid = left + 1 < heapSize && list.get(left) > list.get(left + 1)
                    ? left + 1 : left;
            mid = list.get(index) < list.get(mid) ? index : mid;
            if (index == mid) {
                break;
            }
            Collections.swap(list,index,mid);
            index = mid;
            left = index * 2 + 1;
        }
    }
}
