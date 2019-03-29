import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/3/16 10:26
 */
public class ByteDance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.next();
            char[] b = a[i].toCharArray();
            char[] c = new char[b.length];
            int x = 0;
            for(int j = 0; j < b.length; j++) {
                int p = j;
                if(b[j] == b[j+1]) {
                    while(b[j+1] == b[j+2]) {
                        c[x] = b[j++];
                    }
                }
            }
        }

    }
}
