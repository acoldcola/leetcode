package 第309场周赛;

/**
 * @Author ZhangKe
 * @Date 2022/9/4 10:31
 * @Version 1.0
 */
public class test3 {
    public static void main(String[] args) {
        test3 test3 = new test3();
        test3.longestNiceSubarray(new int[]{744437702,379056602,145555074,392756761,560864007,934981918,113312475,1090,16384,33,217313281,117883195,978927664});
    }
    public int longestNiceSubarray(int[] nums) {
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            int a = i;
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] & nums[j]) == 0) {
                    a = j;
                }else {
                    break;
                }
            }
            max = Math.max(a - i + 1 ,max);
            if (a == nums.length - 2) {
                return max;
            }
        }
        return max;
    }
}
