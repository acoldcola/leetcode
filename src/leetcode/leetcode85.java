package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/12/26 11:12
 * @Version 1.0
 * 最大面积
 */
public class leetcode85 {
    public static void main(String[] args) {
        leetcode85 l = new leetcode85();
        l.maximalRectangle(new char[][]{});
    }

    // 动态规划
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int res = 0;
        // 代表宽度
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = j == 0 ? 1 : dp[i][j - 1] + 1;
                    int width = dp[i][j];
                    for (int m = i; m >= 0 && matrix[m][j] == '1'; m--) {
                        width = Math.min(width, dp[m][j]);
                        res = Math.max(res, width * (i - m + 1));
                    }
                }
            }
        }
        return res;
    }
     // 单调栈
    /*public  int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int res = 0;
        // 多设置一个数，在使用单调栈时可以将栈内的全部导出
        int[] high = new int[matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    high[j] = high[j] + 1;
                }else {
                    high[j] = 0;
                }
            }
            res = Math.max(res,getRes(high));
        }
        return res;
    }

    public  int getRes(int[] high) {
        if (high == null || high.length == 0) {
            return 0;
        }
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < high.length; i++) {
            while (!stack.isEmpty() && high[i] <= high[stack.peek()]) {
                res = Math.max(res, high[stack.pop()] * (stack.isEmpty() ? i : (i - stack.peek()-1)));
            }
            stack.push(i);
        }
        return res;
    }*/
}
