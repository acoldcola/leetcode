package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/4/25 15:13
 * @Version 1.0
 */
public class team1 {
    public static void main(String[] args) {
        expectNumber(new int[] {1,1,1});
    }
    public static int expectNumber(int[] scores) {
        Arrays.sort(scores);
        int sum = 0;
        int i = 0;
        while (i < scores.length) {
            int j = i + 1;
            while (j < scores.length && scores[i] == scores[j]){
                j++;
            }
            sum++;
            i = j;
        }
        return sum;
    }
}