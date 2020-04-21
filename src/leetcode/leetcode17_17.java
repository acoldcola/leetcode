package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 17:25
 * @Version 1.0
 * 多次搜索
 */
public class leetcode17_17 {
    public static void main(String[] args) {
        int[][] a =multiSearch("abc",new String[] {""});
        System.out.println(a);
    }
    public static int[][] multiSearch(String big, String[] smalls) {
        List<List<Integer>> allList = new ArrayList<>();
        for (int i = 0; i < smalls.length; i++) {
            List<Integer> list = new ArrayList<>();
            if ("".equals(smalls[i])) {
                continue;
            }
            if (big.contains(smalls[i])) {
                int index = 0;
                while (big.indexOf(smalls[i], index) != -1) {
                    int sum = big.indexOf(smalls[i], index);
                    list.add(sum);
                    index = sum +1;
                }
            }
            allList.add(list);
        }
        if (allList.size() == 0 || allList == null) {
            return new int[1][0];
        }
        int[][] a = new int[smalls.length][];
        for (int i = 0; i < allList.size();i++){
            a[i] = new int[allList.get(i).size()];
            for (int j = 0; j < allList.get(i).size(); j++) {
                a[i][j] = allList.get(i).get(j);
            }
        }
        return a;
    }
}
