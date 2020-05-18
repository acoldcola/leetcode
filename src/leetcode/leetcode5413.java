package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/5/17 10:37
 * @Version 1.0
 */
public class leetcode5413 {
    public String arrangeWords(String text) {
        String[] str = text.split(" ");
        str[0] = str[0].toLowerCase();
        Arrays.sort(str,(o1,o2)->o1.length() - o2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length;i++) {
            if (i == 0){
                sb.append(str[i].substring(0,1).toUpperCase()).append(str[i].substring(1));
            }else {
                sb.append(str[i]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}