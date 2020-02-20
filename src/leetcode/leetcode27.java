package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/9/10 17:50
 * 移除元素
 */
public class leetcode27 implements Cloneable{
    public static void main(String[] args){
        int[] a = {3,3};
        removeElement(a,5);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] == val) {
                fast ++;
                continue;
            }
            nums[slow++] = nums[fast++];
        }
        return slow;
    }
}