package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/7 10:35
 * @Version 1.0
 */
public class leetcode5428 {
    public static void main(String[] args) {
        leetcode5428 leetcode5428 = new leetcode5428();
        leetcode5428.shuffle(new int[] {2,5,1,3,4,7},3);
    }
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[nums.length];
        int o = 0;
        int p = n;
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[o++];
            a[++i] = nums[p++];
        }
        return a;
    }
}

