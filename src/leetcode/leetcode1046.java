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
}
