package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/11 16:33
 * @Version 1.0
 * 连续数组
 */
public class leetcode525 {
    public static void main(String[] args) {
        findMaxLength(new int[] {0,1,1,0,1,0,1,0,0,1,0,0,1});
    }
    public static int findMaxLength(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < nums.length;i++) {
            int sum = 0;
            int a = 0;
            int b = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    a++;
                }else {
                    b++;
                }
                if (a == b){
                    sum = sum * a;
                }
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
