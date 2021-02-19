package leetcode;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/2/6 22:52
 * @Version 1.0
 */
public class leetcode5658 {
    public static void main(String[] args) {
        lengthOfLIS(new int[]{-7,-1,0,-2,1,3,8,-2,-6,-1,-10,-6,-6,8,-4,-9,-4,1,4,-9});
    }
    public static int lengthOfLIS(int[] nums) {
        int max = nums[0];
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (a >= 0){
                a = a + nums[i];
            }else {
                a = nums[i];
            }
            max = Math.max(Math.abs(a),max);
        }
        int b = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (b <= 0){
                b = b + nums[i];
            }else {
                b = nums[i];
            }
            max = Math.max(Math.abs(b),max);
        }
        return max;
    }
}
