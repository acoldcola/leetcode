package 笔试;

import java.util.Scanner;

/**
 *
 */
public class kuaishou3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int a = Integer.valueOf(str);
        int count = 0;
        while (a > 0) {
            a = a & (a - 1);
            count++;
        }
        System.out.println(count);
    }
}
