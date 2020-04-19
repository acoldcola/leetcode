package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/4/19 11:00
 * @Version 1.0
 * 点菜展示表
 */
public class leetcode5389 {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        String[][] strings = {{"David","3","Ceviche"},{"Corina","10","Beef Burrito"},{"David","3","Fried Chicken"},{"Carla","5","Water"},{"Carla","5","Ceviche"},{"Rous","3","Ceviche"}};
        for (int i = 0; i < strings.length; i++) {
            List<String> list = Arrays.asList(strings[i]);
            lists.add(list);
        }
        displayTable(lists);
    }
    public static List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> lists = new ArrayList<>();
        HashMap<String ,HashMap<String,Integer>> hashMap = new HashMap<>();
        List<String> strList = new ArrayList<>();
        for (List<String> list: orders) {
            if (!hashMap.containsKey(list.get(1))) {
                if (!strList.contains(list.get(2))) {
                    strList.add(list.get(2));
                }
                HashMap<String,Integer> s = new HashMap<>();
                s.put(list.get(2),1);
                hashMap.put(list.get(1),s);
            }else {
                HashMap<String,Integer> s = hashMap.get(list.get(1));
                int num = 1;
                if (s.containsKey(list.get(2))) {
                    num += s.get(list.get(2));
                }else {
                    if (!strList.contains(list.get(2))) {
                        strList.add(list.get(2));
                    }
                }
                s.put(list.get(2),num);
                hashMap.put(list.get(1),s);
            }
        }
        Collections.sort(strList);
        strList.add(0,"Table");
        lists.add(strList);
        Set<String> strings = hashMap.keySet();
        Set<Integer> sortSet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (String sss : strings) {
            sortSet.add(Integer.valueOf(sss));
        }
        for (Integer ssss : sortSet) {
            String str = String.valueOf(ssss);
            String[] strs = new String[strList.size()];
            Arrays.fill(strs,"0");
            strs[0] = str;
            HashMap<String ,Integer> h = hashMap.get(str);
            Set<String> string1s = h.keySet();
            for (String s : string1s) {
                for(int i = 1; i < strList.size(); i++) {
                    if (s.equals(strList.get(i))) {
                        strs[i] = String.valueOf(h.get(s));
                    }
                }
            }
            List<String> stringlist = Arrays.asList(strs);
            lists.add(stringlist);
        }
        return lists;
    }
}
