package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 9:44
 * @Version 1.0
 * 统计「优美子数组」
 */
public class leetcode1248 {
    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{45627, 50891, 94884, 11286, 35337, 46414, 62029, 20247, 72789, 89158, 54203, 79628, 25920, 16832, 47469, 80909}, 1));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int cur = 0;
        while (i < nums.length - k && j < nums.length) {
            if (nums[j++] % 2 != 0) {
                cur++;
            }
            if (cur == k) {
                sum++;
                if (nums[i] % 2 == 0) {
                    while (nums[i] % 2 == 0) {
                        i++;
                        sum++;
                    }
                    for (int m = i - 1; m >= 0 && nums[m] % 2 == 0; m--) {
                        for (int n = j; n < nums.length && nums[n] % 2 == 0; n++) {
                            sum++;
                        }
                    }
                }
            } else if (cur > k) {
                sum++;
                cur--;
                i++;
                if (nums[i] % 2 == 0) {
                    while (nums[i] % 2 == 0) {
                        i++;
                        sum++;
                    }
                    for (int m = i - 1; m >= 0 && nums[m] % 2 == 0; m--) {
                        for (int n = j; n < nums.length && nums[n] % 2 == 0; n++) {
                            sum++;
                        }
                    }
                }
            }
        }
        return sum;
    }
}
