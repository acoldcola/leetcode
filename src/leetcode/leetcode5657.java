package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/6 22:43
 * @Version 1.0
 */
public class leetcode5657 {
    public int sumOfUnique(int[] nums) {
        int[] a = new int[101];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                sum+=i;
            }
        }
        return sum;
    }
}
