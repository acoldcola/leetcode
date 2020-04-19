package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/4/18 15:09
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        test1 test1 = new test1();
        test1.numWays(5,new int[][] {{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}},3);
    }
    public int numWays(int n, int[][] relation, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < relation.length; i++) {
            if (relation[i][0] == 0) {
                queue.offer(relation[i][1]);
            }
        }
        int sum = 0;
        int count = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int x = queue.poll();
                for (int j = 0; j < relation.length && count < k; j++) {
                    if (x == relation[j][0]) {
                        queue.offer(relation[j][1]);
                    }
                }
                if (count == k && x== n-1) {
                    sum ++;
                }
            }
            count ++;
        }
        return sum;
    }
}
