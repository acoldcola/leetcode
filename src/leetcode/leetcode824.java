package leetcode;

import javax.net.ssl.SSLContext;

/**
 * @Author ZhangKe
 * @Date 2020/4/13 14:50
 * @Version 1.0
 * 山羊拉丁文
 */
public class leetcode824 {
    public String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        String a = "a";
        String[] newStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i].substring(0,1).toLowerCase();
            if ("a".equals(s) || "e".equals(s) || "i".equals(s)
            || "o".equals(s) || "u".equals(s)) {
                newStrings[i] = strings[i] + "ma" + a;
                a += "a";
            }else {
                newStrings[i] = strings[i].substring(1) + strings[i].substring(0,1)+ "ma" + a;
                a += "a";
            }
        }
        return String.join(" ",newStrings);
    }
}
