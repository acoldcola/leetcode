package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/6/28 11:25
 * @Version 1.0
 */
public class leetcode5450 {
    public static void main(String[] args) {
        leetcode5450 leetcode5450 = new leetcode5450();
        leetcode5450.numSubseq(new int[] {5,2,4,1,7,6,8},16);
    }
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length;i++) {
            int min = nums[i];
            int max = nums[i];
            int res = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                }
                if (nums[j] > max) {
                    max = nums[j];
                }
                if (max + min <= target) {
                    res %= (10^9 + 7);
                    res++;
                    if (j == nums.length - 1) {
                        if (res > 2) {
                            int x = (j- i - 1);
                            sum += ((x + 1) * x)/2 + 1;
                        }else {
                            sum += res;
                        }
                    }
                }else {
                    if (res > 2) {
                        int x = (j- i - 1);
                        sum += ((x + 1) * x)/2 + 1;
                    }else {
                        sum += res;
                    }
                    break;
                }
            }
        }
        return sum;
    }
}
