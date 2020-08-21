package 牛客;

/**
 * @Author ZhangKe
 * @Date 2020/8/6 21:03
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 1;
        System.out.println("第"+1+"天:" + a);
        System.out.println("第"+2+"天:" + b);
        int c = 0;
        for (int i = 2; i < n; i++) {
           c = a + b;
           a = b;
           b = c;
           System.out.println("第"+(i+1)+"天:" + c);
        }
    }

}
