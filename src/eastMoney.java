
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/3/27 14:06
 */
public class eastMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list1.add(i);
        }
        List<Integer> listAll = change(list1, list2);
        for (int list : listAll) {
            System.out.print(list + " ");
        }
    }

    public static List<Integer> change(List<Integer> list1, List<Integer> list2) {
        if (list1.size() < 2) {
            list2.add(list1.remove(0));
            return list2;
        }
        list2.add(list1.remove(0));
        int x = list1.remove(0);
        list1.add(x);
        change(list1, list2);
        return list2;
    }
}
