package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 18:14
 * @Version 1.0
 * 按既定顺序创建目标数组
 */
public class leetcode1389 {
    public static void main(String[] args) {
        leetcode1389 leetcode1389 = new leetcode1389();
        int[] a = {0,1,2,3,4};
        int[] b = {0,1,2,2,1};
        leetcode1389.createTargetArray(a,b);
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            target[i] = -1;
        }
        for (int i = 0; i < index.length; i++) {
            int temp = target[i];
            if (temp == -1) {
                target[i] = nums[index[i]];
            }else {
                int cur = i + 1 == index.length ? 0 : i+1 ;
                while (target[cur] != -1) {
                    int x = target[cur];
                    target[cur] = temp;
                    temp = x;
                    cur = cur + 1 == index.length ? 0 : cur+1;
                }if (target[cur] == -1) {
                    target[cur] = temp;
                }
            }
        }
        return target;
    }
}
