package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/9 10:41
 * @Version 1.0
 * 把数字翻译成字符串
 */
public class interview46 {
    public static void main(String[] args) {
        interview46 i = new interview46();
        i.translateNum(25);
    }
    public int translateNum(int num) {
        String str = String.valueOf(num);
        if (str.length() <= 1) {
            return str.length();
        }
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 2; i <= str.length(); i++) {
            int temp = Integer.valueOf(str.substring(i-2,i));
            if (temp >= 10 && temp <= 25) {
                c = a + b;
                a = b;
                b = c;
            }else {
                c = b;
                a = b;
                b = c;
            }
        }
        return c;
    }
}
