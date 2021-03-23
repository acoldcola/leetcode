package 竞赛.第233场周赛;

import com.sun.org.apache.bcel.internal.generic.IUSHR;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author ZhangKe
 * @Date 2021/3/21 10:26
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        getNumberOfBacklogOrders(new int[][]{{26,7,0},{16,1,1},{14,20,0},{23,15,1},{24,26,0},{19,4,1},{1,1,0}});
    }
    public static int getNumberOfBacklogOrders(int[][] orders) {
        PriorityQueue<int[]> buy = new PriorityQueue<>( (a, b) -> b[0]- a[0]);
        PriorityQueue<int[]> sell = new PriorityQueue<>((a, b) -> a[0]- b[0]);
        for (int i = 0; i < orders.length; i++) {
            if (orders[i][2] == 0) {
                if (sell.isEmpty()) {
                    buy.offer(new int[] {orders[i][0],orders[i][1]});
                }else {
                    if (sell.peek()[0] <= orders[i][0] ) {
                        while (!sell.isEmpty() && sell.peek()[0] <= orders[i][0] && orders[i][1] >= 0) {
                            int[] a = sell.poll();
                            if (a[1] > orders[i][1]) {
                                int x = a[1] - orders[i][1];
                                orders[i][1] = 0;
                                sell.offer(new int[] {a[0],x});
                                break;
                            }else if (a[1] < orders[i][1]) {
                                orders[i][1] = orders[i][1] - a[1];
                            }else {
                                orders[i][1] = 0;
                                break;
                            }
                        }
                        if (orders[i][1] != 0) {
                            buy.offer(new int[]{orders[i][0],orders[i][1]});
                        }
                    }else {
                        buy.offer(new int[] {orders[i][0],orders[i][1]});
                    }
                }
            }else {
                if (buy.isEmpty()) {
                    sell.offer(new int[] {orders[i][0],orders[i][1]});
                }else {
                    if (buy.peek()[0] >= orders[i][0] ) {
                        while (!buy.isEmpty() && buy.peek()[0] >= orders[i][0] && orders[i][1] >= 0) {
                            int[] a = buy.poll();
                            if (a[1] > orders[i][1]) {
                                int x = a[1] - orders[i][1];
                                orders[i][1] = 0;
                                buy.offer(new int[] {a[0],x});
                                break;
                            }else if (a[1] < orders[i][1]) {
                                orders[i][1] = orders[i][1] - a[1];
                            }else {
                                orders[i][1] = 0;
                                break;
                            }
                        }
                        if (orders[i][1] != 0) {
                            sell.offer(new int[]{orders[i][0],orders[i][1]});
                        }
                    }else {
                        sell.offer(new int[] {orders[i][0],orders[i][1]});
                    }
                }
            }
        }
        long res = 0;
        while (!buy.isEmpty()) {
            res += buy.poll()[1];
            res %= (10e9 + 7);
        }while (!sell.isEmpty()) {
            res += sell.poll()[1];
            res %= (10e9 + 7);
        }
        res = res % (1000000007);
        return (int)res;
    }
}
