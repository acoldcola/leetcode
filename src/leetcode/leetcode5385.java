package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/2 22:45
 * @Version 1.0
 * 改变一个整数能得到的最大差值
 */
public class leetcode5385 {
    public static void main(String[] args) {

        System.out.println(maxDiff(555));
    }
    public static int maxDiff(int num) {
        int a = 9;
        int b = 1;
        if (num  < 10){
            return 8;
        }
        char[] chars = String.valueOf(num).toCharArray();
        if (chars[0] == '9') {
            char[] chars1 = String.valueOf(num).toCharArray();
            StringBuilder str1 = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars1[i] == chars[0]) {
                    chars1[i] = '1';
                }
                str1.append(chars1[1]);
            }
            a = Integer.parseInt(str1.toString());
            char[] chars2 = String.valueOf(num).toCharArray();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars2[i] == chars[1]) {
                    chars2[i] = '9';
                }
                str2.append(chars2[i]);
            }
            b = Integer.parseInt(str2.toString());
            return b-a;
        }else {
            char[] chars1 = String.valueOf(num).toCharArray();
            StringBuilder str1 = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars1[i] == chars[0]) {
                    chars1[i] = '9';
                }
                str1.append(chars1[i]);
            }
            a = Integer.parseInt(str1.toString());
            char[] chars2 = String.valueOf(num).toCharArray();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars2[i] == chars[1]) {
                    chars2[i] = '0';
                }
                str2.append(chars2[i]);
            }
            b = Integer.parseInt(str2.toString());
            return a - b;
        }

    }
}
