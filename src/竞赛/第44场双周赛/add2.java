package 竞赛.第44场双周赛;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/1/24 10:52
 * @Version 1.0
 */
public class add2 {
    public static void main(String[] args) {
        minCharacters("ace","abe");
    }
    public static int minCharacters(String a, String b) {
        int one = 0;
        int one1 = 0;
        int two = 0;
        int two2 = 0;
        int three = 0;
        char x = 'a';
        char x1 = 'z';
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0) + 1);
            if (a.charAt(i) >= x) {
                x = a.charAt(i);
            }
            if (a.charAt(i) <= x1){
                x1 = a.charAt(i);
            }
        }
        char y = 'a';
        char y1 = 'z';
        for (int i = 0; i < b.length(); i++) {
            map.put(b.charAt(i),map.getOrDefault(b.charAt(i),0) + 1);
            if (b.charAt(i) > y) {
                y = b.charAt(i);
            }
            if (b.charAt(i) <= y1){
                y1 = b.charAt(i);
            }
            if (b.charAt(i) <= x) {
                one ++;
            }
            if (b.charAt(i) >= x1) {
                two2++;
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) <= y){
                two++;
            }
            if (a.charAt(i) >= y1) {
                one1++;
            }
        }
        one = Math.min(one,one1);
        two = Math.min(two,two2);
        int max = 0;
        for (Character c : map.keySet()) {
            max = Math.max(max,map.get(c));
        }
        three = a.length() + b.length() - max;
        int res = Math.min(one,two);
        res = Math.min(res,three);
        return res;
    }
}
