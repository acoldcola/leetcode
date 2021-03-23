package 竞赛.第48场双周赛;

/**
 * @Author ZhangKe
 * @Date 2021/3/20 22:26
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        secondHighest("abc111");
    }
    public static int secondHighest(String s) {
        int[] a = new int[10];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                a[Integer.valueOf(String.valueOf(s.charAt(i)))] ++;
            }
        }
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                if (x == 1) {
                    return i;
                }
                x++;
            }
        }
        return -1;
    }
}
