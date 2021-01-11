package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/1/11 13:25
 * @Version 1.0
 * 交换字符串中的元素
 */
public class leetcode1202 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        lists.add(list);
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        lists.add(list);
        smallestStringWithSwaps("cba",lists);
    }
    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int[] a = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (List<Integer> list : pairs) {
            a[find(list.get(0),a)] = a[find(list.get(1),a)];
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int x = find(a[i],a);
            List<Integer> list = map.getOrDefault(x,new ArrayList<>());
            list.add(i);
            map.put(x,list);
        }
        char[] chars = new char[s.length()];
        for(Integer i : map.keySet()){
            List<Integer> list = map.get(i);
            char[] chars1 = new char[list.size()];
            for (int j = 0; j < list.size(); j++) {
                chars1[j] = s.charAt(list.get(j));
            }
            Arrays.sort(chars1);
            for (int j = 0; j < list.size(); j++) {
                chars[list.get(j)] = chars1[j];
            }
        }
        return new String(chars);
    }

    public static int find(int x, int[] nums) {
        if (x != nums[x]) {
            nums[x] = find(nums[x],nums);
        }
        return nums[x];
    }
}
