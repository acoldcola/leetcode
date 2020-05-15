package 笔试;

import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/3/30 19:49
 */
public class kuaishou2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            int n = 0;
            if (i >= 10) {
                if (i == 100) {
                    n = 1;
                } else
                    n += i / 10 + i % 10;
            } else {
                n += i;
            }
            for (int j = 0; j < b; j++) {
                int m = 0;
                if (j >= 10) {
                    if (j == 100) {
                        m = 1;
                    } else
                        m += j / 10 + j % 10;
                } else {
                    m += j;
                }
                if (m + n <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
