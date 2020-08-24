package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/8/21 17:46
 * @Version 1.0
 * 模糊坐标
 */
public class leetcode816 {
    public static void main(String[] args) {
        leetcode816 l = new leetcode816();
        l.ambiguousCoordinates("(123)");
    }
    public List<String> ambiguousCoordinates(String S) {
        List<String> list = new ArrayList<>();
        for (int i = 2; i < S.length()-1;i++){
            String string = cal(S.substring(1,i),S.substring(i,S.length() -1));
            list.add(string);
        }
        return list;
    }

    public String cal(String str1,String str2){
        if (str1.startsWith("00") || str2.startsWith("00")) {
            return null;
        }
        if (str1.length() > 1){
            String str = str1.substring(str1.length() - 2,str1.length() - 1);
            if ("00".equals(str)){
                return null;
            }
        }
        String s = str2.substring(0,1);
        if ("0".equals(s)){
            return null;
        }
        String string = "("+str1+","+str2+")";
        return string;
    }
}
