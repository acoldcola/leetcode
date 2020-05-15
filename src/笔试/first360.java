package 笔试;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther ZhangKe
 * @date 2019/4/16 19:12
 */
public class first360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List> list = new LinkedList();
        while (sc.hasNext()) {
            List list1 = new LinkedList();
            while (sc.hasNextInt()) {
                list1.add(sc.nextInt());
            }
            list.add(list1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(judge(list.get(i)));
        }
    }

    public static String judge(List<Integer> list) {
        int i = 0;
        int count = 0;
        int[] a = new int[2];
        int j = 0;
        while (i < (list.size() - 1)) {
            if (list.get(i) > list.get(i + 1)) {
                count++;
                if (j <= 1) {
                    a[j++] = i;
                }
            }
            i++;
        }
        if (count < 2) {
            return "Yes";
        } else if (count == 2) {
            if (list.get(a[1]) < list.get(a[0] + 1) && list.get(a[0]) < list.get(a[1] + 1)) {
                return "Yes";
            } else
                return "No";
        } else {
            return "No";
        }
    }
}
