import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/3/16 11:28
 */
public class ByteDance3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int x = 1;
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
           list.add(sc.nextInt());
        }
        System.out.println(list);
    }
    public static int add(List a) {
        if(a.size() == 1) {
            return 1;
        }
        return 1;
    }
}
