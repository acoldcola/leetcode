package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @Author ZhangKe
 * @Date 2021/1/17 11:28
 * @Version 1.0
 */
public class leetcode5565 {
    public static void main(String[] args) {
        largestSubmatrix(new int[][] {{0,0,1},{1,1,1},{1,0,1}});
    }
    public static int largestSubmatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int res = 0;
        // 多设置一个数，在使用单调栈时可以将栈内的全部导出
        int[] high = new int[matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 1) {
                        high[j] = high[j] + 1;
                    }else {
                        high[j] = 0;
                    }
                }
                res = Math.max(res,getRes(high));
            }
        return res;
    }

    public static int getRes(int[] high) {
        if (high == null || high.length == 0) {
            return 0;
        }
        int res = 0;
        int[] newHigh = new int[high.length+1];
        System.arraycopy(high,0,newHigh,0,high.length);
        Arrays.sort(newHigh, 0, newHigh.length - 1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < newHigh.length; i++) {
            while (!stack.isEmpty() && newHigh[i] <= newHigh[stack.peek()]) {
                res = Math.max(res, newHigh[stack.pop()] * (stack.isEmpty() ? i : (i - stack.peek() - 1)));
            }
            stack.push(i);
        }
        return res;
    }
}
