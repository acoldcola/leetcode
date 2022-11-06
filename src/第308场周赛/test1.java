package 第308场周赛;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2022/8/28 10:25
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        test1 test1 = new test1();
        test1.answerQueries(new int[] {4,5,2,1}, new int[] {3,10,21});
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int num = 0;
            for (int j =0 ; j < nums.length;j++) {
                if (sum > queries[i]) {
                    num--;
                    sum-=nums[j-1];
                }
                num++;
                sum += nums[j];
            }
            if(sum > queries[i]) {
                num--;
            }
            res[i] = num;
        }
        return res;
    }
}
