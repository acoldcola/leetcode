package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/1/18 13:16
 * @Version 1.0
 * 账户合并
 */
public class leetcode721 {
    public  List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            List<String> list = accounts.get(i);
            for (int j = 1; j < list.size(); j++) {
                String str = list.get(j);
                List<Integer> list1 = map.getOrDefault(str,new ArrayList<>());
                list1.add(i);
                map.put(str,list1);
            }
        }
        int[] a = new int[accounts.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (String str : map.keySet()) {
            List<Integer> list = map.get(str);
            if (list.size() == 1) {
                continue;
            }
            for (int i = 0; i < list.size() - 1; i++) {
                a[find(list.get(i),a)] = find(list.get(list.size() - 1),a);
            }
        }
        Map<Integer,List<Integer>> unionMap = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            int num = find(i,a);
            List<Integer> list = unionMap.getOrDefault(num,new ArrayList<>());
            list.add(i);
            unionMap.put(num,list);
        }
        List<List<String>> res = new ArrayList<>();
        for (Integer i : unionMap.keySet()) {
            Set<String> set = new LinkedHashSet<>();
            List<Integer> list = unionMap.get(i);
            for (Integer s : list) {
                List<String> stringList = accounts.get(s);
                for (String str : stringList) {
                    set.add(str);
                }
            }
            List<String> result = new ArrayList<>();
            result.addAll(set);
            Collections.sort(result);
            res.add(result);
        }
        return res;
    }

    public  int find(int x, int[] nums) {
        if (x != nums[x]) {
            nums[x] = find(nums[x],nums);
        }
        return nums[x];
    }
}
