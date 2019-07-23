import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] a = str.toCharArray();
        char x = 'a';
        char y = (char) (x - 31);
        char[] b = new char[a.length];
        int i = a.length - 1;
        int j = 0;
        while (i >= 0) {
            b[j++] = a[i--];
        }
        System.out.println(b);
        ArrayList list = new ArrayList<>();
        list.add(1);
        System.out.println(add());
    }

    public static ArrayList add() {
        ArrayList list = new ArrayList<>();
        list.add(new Object());
        list.add(new Integer(2));
        return list;
    }
}
