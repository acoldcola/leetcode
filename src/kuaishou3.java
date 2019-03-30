import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/3/30 20:16
 * 转换二进制
 */
public class kuaishou3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int a = Integer.valueOf(str);
        int count = 0;
        while(a > 0){
            a = a & (a-1);
            count++;
        }
        System.out.println(count);
    }
}
