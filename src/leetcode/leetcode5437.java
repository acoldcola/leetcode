package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/6/14 10:37
 * @Version 1.0
 */
public class leetcode5437 {
    public static void main(String[] args) {
        leetcode5437 leetcode5437 = new leetcode5437();
        leetcode5437.findLeastNumOfUniqueInts(new int[]{1,1},1);
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arr.length;i++) {
            hashmap.put(arr[i],hashmap.getOrDefault(arr[i],0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        Iterator it = hashmap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Integer value = (Integer) entry.getValue();
            list.add(value);
        }
        Collections.sort(list);
        int sum = 0;
        int size = 0;
        for (int i = 0; i <= list.size(); i++) {
            if (sum > k) {
                size --;
                break;
            }else if(sum == k){
                break;
            }
            if (i < list.size()) {
                sum+=list.get(i);
                size++;
            }
        }
        return list.size() - size;
    }
}
