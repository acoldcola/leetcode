package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/8 11:46
 * @Version 1.0
 * 旋转数组
 */
public class leetcode189 {
    public static void main(String[] args) {
        leetcode189 l = new leetcode189();
        l.rotate(new int[] {1,2,3,4,5,6,7},3);
    }
    public void rotate1(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        k = k % nums.length;
        while (k > 0) {
            int a = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                nums[i] = a;
                a = temp;
            }
            k--;
        }
        return;
    }

    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        k %= nums.length;
        reserve(nums,0,nums.length - 1);
        reserve(nums,0,k - 1);
        reserve(nums,k ,nums.length -1);
    }

    public void reserve(int[] nums, int l, int r) {
        while (l <= r) {
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}
