package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/8/2 10:41
 * @Version 1.0
 */
public class leetcode5476 {
    public static void main(String[] args) {
        leetcode5476 leetcode5476 = new leetcode5476();
        leetcode5476.getWinner(new int[] {2,1,3,5,4,6,7},2);
    }
    public int getWinner(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]){
                max =arr[i];
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i < arr.length;i++){
            queue.add(arr[i]);
        }
        int cou = arr[0];
        int sum = 0;
        while (!queue.isEmpty()){
            if (cou == max) {
                break;
            }
            if (sum == k)
                break;
            if (cou > queue.peek()) {
                sum ++;
                queue.add(queue.poll());
            }
            else {
                sum = 0;
                sum ++;
                queue.add(cou);
                cou = queue.poll();
            }
        }
        return cou;
    }
}
