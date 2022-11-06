package 第308场周赛;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2022/8/28 10:25
 * @Version 1.0
 */
public class test4 {
    public static void main(String[] args) {
        test4 test4 = new test4();
        test4.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21});
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int num = 0;
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (sum <= queries[i]) {
                    sum += nums[j];
                    num ++;
                }else {
                    num --;
                    break;
                }
            }
            res[i] = num;
        }
        return res;
    }
}
