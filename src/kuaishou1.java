import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/3/30 19:43
 * 判断一棵树是不是满二叉树
 */
public class kuaishou1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = 0, x;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    x = sc.nextInt();
                    ans += x;
                }
            }
            System.out.println(ans);
        }
}
