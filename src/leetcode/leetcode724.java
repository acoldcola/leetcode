package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/28 9:44
 * @Version 1.0
 * 寻找数组的中心索引
 */
public class leetcode724 {
    public static void main(String[] args) {
        pivotIndex(new int[] {-1,-1,0,0,-1,-1});
    }
    public static int pivotIndex(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return -1;
        }
        int[] a = new int[nums.length + 1];
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + nums[i - 1];
        }
        int res = -1;
        for (int i = 0; i < nums.length;i++) {
            if (a[i] == a[a.length - 1] - a[i + 1]) {
                res = i;
                break;
            }
        }
        return res;
    }
}
