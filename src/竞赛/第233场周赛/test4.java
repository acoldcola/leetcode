package 竞赛.第233场周赛;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/3/21 10:26
 * @Version 1.0
 */
public class test4 {

    public static void main(String[] args) {
        countPairs(new int[] {1,4,2,7},2,6);
    }
    public static int countPairs(int[] nums, int low, int high) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        List<Integer> res = new ArrayList<>(set);
        for (int i = 0; i < res.size(); i++) {
            for (int j = i + 1; j < res.size(); j++) {
                list.add(res.get(i) ^ res.get(j));
            }
        }
        Collections.sort(list);
        int i = 0;
        int j = list.size() - 1;
        while (i <= j && (list.get(i) < low && list.get(j) > high)) {
            i++;
            j--;
        }
        while (i <= j && list.get(i) < low) {
            i++;
        }
        if ( i <= j && list.get(j) > high) {
            j--;
        }
        return j >= i ? j-i+1:0;
    }
}
