package 竞赛.第227场周赛;

import 笔试.WeBank01;

/**
 * @Author ZhangKe
 * @Date 2021/2/7 10:27
 * @Version 1.0
 */
public class test3 {
    public static void main(String[] args) {
        largestMerge("eenpnn",
                "ee");
    }
    public static String largestMerge(String word1, String word2) {
        int a = 0;
        int b = 0;
        StringBuilder sb = new StringBuilder();
        while (a < word1.length() && b < word2.length()) {
            if (word1.charAt(a) <  word2.charAt(b)) {
                sb.append(word2.charAt(b++));
            }else if (word1.charAt(a) > word2.charAt(b)) {
                sb.append(word1.charAt(a++));
            }else {
                int x = a + 1;
                int y = b + 1;
                boolean flag = false;
                while (x < word1.length() && y < word2.length()) {
                    if (word1.charAt(x) > word2.charAt(y)) {
                        flag = true;
                        break;
                    }else if(word1.charAt(x) < word2.charAt(y)) {
                        flag = false;
                        break;
                    }else {
                        x++;
                        y++;
                    }
                }
                if (x == word2.length()) {
                    flag = true;
                }
                if (flag) {
                    sb.append(word1.charAt(a++));
                }else {
                    sb.append(word2.charAt(b++));
                }
            }
        }
        for (int i = a; i < word1.length(); i++) {
            sb.append(word1.charAt(i));
        }
        for (int i = b; i < word2.length(); i++) {
            sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}
