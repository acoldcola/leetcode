package leetcode;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/7/11 22:45
 * @Version 1.0
 */
public class leetcode5455 {
    public static void main(String[] args) {
        leetcode5455 l = new leetcode5455();
        l.rangeSum(new int[] {1,2,3,4},4,1,10);
    }
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] a = new int[nums.length];
        a[0] = nums[0];
        List<Integer> list = new ArrayList<>();
        list.add(a[0]);
        for (int i = 1; i < nums.length;i++) {
            a[i] = nums[i] + a[i - 1];
            list.add(a[i]);
        }
        for (int i = 1; i < a.length;i++) {
            for (int j = i; j < a.length; j++) {
                list.add(a[j] - a[i -1]);
            }
        }

        Collections.sort(list);
        int num = 0;
        for (int i = left - 1; i < right;i++) {
            num += list.get(i);
            int b = 31 % (10^9 + 7);
            num = num % (10^9 + 7);
        }
        return num;
    }
}
