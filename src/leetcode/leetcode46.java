package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/7/26 18:05
 * 全排列
 */
public class leetcode46 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        fullSort(arr, 0, arr.length - 1,new ArrayList<>());
    }

    public static void fullSort(int[] arr, int start, int end, List<List<Integer>> list) {
        // 递归终止条件
        if (start == end) {
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(arr, i, start);
            list.add(Arrays.asList());
            fullSort(arr, start + 1, end, list);
            swap(arr, i, start);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}