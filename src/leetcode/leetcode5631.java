package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/20 11:01
 * @Version 1.0
 */
public class leetcode5631 {
    public static void main(String[] args) {
        leetcode5631 leetcode5631 = new leetcode5631();
        leetcode5631.maxResult(new int[] {1,-1,-2,4,-7,3},2);
    }
    public int maxResult(int[] nums, int k) {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < nums.length-k; i++) {
            boolean falg = false;
            int[] a = new int[2];
            a[1] = Integer.MIN_VALUE;
            for (int j = i + 1; j <= i + k && j < nums.length;j++){
                if (nums[j] >= 0) {
                    sum += nums[j];
                    temp = j;
                    falg = true;
                }else {
                    if (nums[j] > a[1]) {
                        a[0] = j;
                        a[1] = nums[j];
                    }
                }
            }
            if (!falg) {
                sum += a[1];
                temp = a[0];
            }
            temp --;
            i = temp;
        }
        if (temp + 2 < nums.length){
            boolean falg = false;
            int[] a = new int[2];
            a[1] = Integer.MIN_VALUE;
            for (int j = temp + 2; j < nums.length;j++){
                if (nums[j] >= 0) {
                    sum += nums[j];
                    temp = j;
                    falg = true;
                }else {
                    if (nums[j] > a[1]) {
                        a[0] = j;
                        a[1] = nums[j];
                    }
                }
            }
            if (!falg) {
                sum += a[1];
                temp = a[0];
            }
            sum = sum + nums[0];
            if (temp != nums.length - 1){
                sum += nums[nums.length - 1];
            }
        }else {
            sum = sum + nums[0];
            if (temp != nums.length - 2){
                sum += nums[nums.length - 1];
            }
        }

        return sum;
    }
}