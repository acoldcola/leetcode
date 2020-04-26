package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @auther ZhangKe
 * @date 2019/7/26 18:05
 * 全排列
 */
public class leetcode46 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        permute(arr);
    }

    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        back(list,path,nums.length,0,used,nums);
        return list;
    }

    public static void back(List<List<Integer>> list, List<Integer> path,int len,int depth,boolean[] used,int[] nums) {
        if (depth == len) {
            list.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                back(list,path,len,depth + 1,used,nums);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}