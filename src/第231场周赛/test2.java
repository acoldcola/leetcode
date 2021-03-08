package 第231场周赛;

/**
 * @Author ZhangKe
 * @Date 2021/3/7 10:29
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        minElements(new int[]{-1,0,1,1,1} ,1 ,771843707);
    }
    public static int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        long res = goal - sum;
        if (res == 0) {
            return 0;
        }

        if (limit >= Math.abs(res)) {
            return 1;
        } else {
            if (res % limit == 0) {
                return (int) (Math.abs(res) / limit);
            }else {
                return (int) (Math.abs(res) / limit + 1);
            }
        }

    }
}
