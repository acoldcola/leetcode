package leetcode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/12 20:12
 * @Version 1.0
 * 最后一块石头的重量
 */
public class leetcode1046 {
    public int lastStoneWeight(int[] stones) {
        List list = Arrays.asList(stones);
        for (int i = 0; i < stones.length; i++) {
            heapSort(list,i);
        }
        int heapSize = list.size();
        Collections.swap(list,0,--heapSize);
        while (heapSize > 0) {
            heapTify(list,0,heapSize);
            Collections.swap(list,0,--heapSize);
        }
        while (list.size() > 1) {
            int x = (int) list.get(0);
            list.remove(0);
            int y = (int) list.get(0);
            list.remove(0);
            if (x == y) {
                 
            }
        }
        return 0;
    }
    public void heapSort(List<Integer> list,int index) {
        while (list.get(index) > list.get((index-1)/2)) {
            Collections.swap(list,index,(index-1)/2);
            index = (index-1)/2;
        }
    }
    public void heapTify(List<Integer> list, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int right = left + 1 < heapSize && list.get(left) < list.get(left + 1)
                    ? left + 1 : left;
            right = list.get(right) < list.get(index) ? index : right;
            if (right == index) {
                break;
            }
            Collections.swap(list,index,right);
            index = right;
            left = index * 2 + 1;
        }
    }

    /* // 优先队列
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int i = 0; i < stones.length; i++) {
            queue.offer(stones[i]);
        }
        while (queue.size() >= 2) {
            int x = queue.poll();
            int y = queue.poll();
            if (x != y) {
                queue.offer(x-y);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }*/

    /*// 自己实现大根堆
    public int lastStoneWeight(int[] stones) {
        for (int i = stones.length / 2 - 1; i >= 0; i--) {
            heap(i, stones.length, stones);
        }
        int j = stones.length - 1;
        while (j >= 1) {
            // 取最大的数
            int a = stones[0];
            swap(stones,0,j);
            // 更新堆
            heap(0,j--,stones);
            int b = stones[0];
            swap(stones,0,j);
            heap(0,j--,stones);
            if (a != b) {
                stones[++j] = a - b;
                // 判断加入的数字和堆顶的数字的大小
                if (stones[j] > stones[0]) {
                    swap(stones,0,j);
                    heap(0,j,stones);
                }
            }
        }
        return j == -1 ? 0 : stones[j];
    }

    *//**
     * 建立大根堆
     * @param i
     * @param a
     *//*
    public void heap(int i,int length, int[] a) {
        for (int k = i * 2 + 1; k < length; k = i * 2 + 1) {
            // 比较左右儿子节点那个更大
            if (k + 1 < length && a[k] < a[k+1]) {
                k++;
            }
            if (a[i] < a[k]) {
                swap(a,i,k);
                i = k;
            }else {
                break;
            }
        }
    }

    *//**
     * 数组中两个数交换
     * @param a
     * @param i
     * @param j
     *//*
    public void swap(int[]a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }*/
}
