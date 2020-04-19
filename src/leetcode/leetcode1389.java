package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
