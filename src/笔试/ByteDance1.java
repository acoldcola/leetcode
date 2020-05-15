package 笔试;

import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/3/16 10:07
 */
public class ByteDance1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 1024 - a;
        int x = 0;
        if (b > 64) {
            x = x + (b / 64);
            b = b % 64;
        }
        if (b > 16) {
            x = x + (b / 16);
            b = b % 16;
        }
        if (b > 4) {
            x = x + (b / 4);
            b = b % 4;
        }
        if (b > 1) {
            x = x + b;
        }
        System.out.println(x);
    }
}
