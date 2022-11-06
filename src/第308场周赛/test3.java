package 第308场周赛;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2022/8/28 10:25
 * @Version 1.0
 */
public class test3 {
    public static void main(String[] args) {
        test3 test3 = new test3();
        test3.garbageCollection(new String[] {"G","P","GP","GG"},new int[] {2,4,3});
    }
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] a = new int[3];
        char[] b = new char[]{'M', 'G', 'P'};
        Arrays.fill(a,-1);
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < garbage.length; j++) {
            if (garbage[j].contains(String.valueOf(b[0]))) {
                a[0] = Math.max(a[0], j);
            }
            if (garbage[j].contains(String.valueOf(b[1]))) {
                a[1] = Math.max(a[1], j);
            }
            if (garbage[j].contains(String.valueOf(b[2]))) {
                a[2] = Math.max(a[2], j);
            }
            for (int i = 0; i < garbage[j].length(); i++) {
                map.put(garbage[j].charAt(i), map.getOrDefault(garbage[j].charAt(i),0) + 1);
            }
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                continue;
            }
            for (int j = 0; j <= a[i] -1; j++) {
                sum += travel[j];
            }
            sum += map.get(b[i]);
        }
        return sum;
    }
}
