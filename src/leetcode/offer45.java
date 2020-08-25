package leetcode;

import java.math.BigInteger;
import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/8/25 15:31
 * @Version 1.0
 * 把数组排成最小的数
 */
public class offer45 {
    public static void main(String[] args) {
        offer45 o = new offer45();
        o.minNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    }

    private List<String> list = new ArrayList<>();

    public String minNumber(int[] nums) {
        if (nums.length == 1) {
            return String.valueOf(nums[0]);
        }
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder sb = new StringBuilder();
        for (String s : str){
            sb.append(s);
        }
        return sb.toString();
    }
}