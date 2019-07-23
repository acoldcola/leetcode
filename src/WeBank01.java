import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/4/11 19:54
 */
public class WeBank01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= a; i++) {
            list.add(i);
        }
        System.out.println(push(list, b));
    }

    public static Integer push(List<Integer> list, int b) {
        int i = 0;
        while (list.size() > 1) {
            if (b + i > list.size()) {
                i = b + i - list.size() + list.size() / b;
            } else {
                i = b + i;
            }
            System.out.print(list.remove(i - 1));
        }
        return list.get(0);
    }
}