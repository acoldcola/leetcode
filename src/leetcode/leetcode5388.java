package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/19 10:33
 * @Version 1.0
 * 重新格式化字符串
 */
public class leetcode5388 {
    public static void main(String[] args) {
        leetcode5388 leetcode5388 = new leetcode5388();
        leetcode5388.reformat("a0b1c2");
    }
    public String reformat(String s) {
        char[] chars = s.toCharArray();
        List<Character> num = new ArrayList<>();
        List<Character> ch = new ArrayList<>();
        for(int i =0; i < chars.length; i++) {
            if (chars[i] >= 97 && chars[i] <= 122) {
                ch.add(chars[i]);
            }else {
                num.add(chars[i]);
            }
        }
        String str = "";
        if (Math.abs(ch.size()-num.size()) > 1) {
            return str;
        }else {
            if (ch.size()==num.size()) {
                for (int i = 0;i < ch.size(); i++) {
                    str += ch.get(i).toString() + num.get(i);
                }
            }else if (ch.size() > num.size()){
                for (int i = 0;i < ch.size() - 1; i++) {
                    str += ch.get(i).toString() + num.get(i);
                }
                str += ch.get(ch.size() - 1);
            }else {
                for (int i = 0;i < num.size() - 1; i++) {
                    str += num.get(i).toString() + ch.get(i);
                }
                str += num.get(num.size() - 1);
            }
            return str;
        }
    }
}
