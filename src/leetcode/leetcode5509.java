package leetcode;

import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/9/6 11:34
 * @Version 1.0
 */
public class leetcode5509 {
    public static void main(String[] args) {
        leetcode5509 l = new leetcode5509();
        l.minCost("aabaa",new int[]{1,2,3,4,1});
    }
    public int minCost(String s, int[] cost) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++){
            int j = i + 1;
            if(s.charAt(i) == s.charAt(j)){
                while (j < s.length() && s.charAt(i) == s.charAt(j)){
                    j++;
                }
                int max = 0;
                for (int x = i; x < j;x++){
                    max = Math.max(max,cost[x]);
                    sum += cost[x];
                }
                sum -= max;
                i = j - 1;
            }
        }
        return sum;
    }
}
