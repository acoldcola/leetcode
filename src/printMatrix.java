import java.util.ArrayList;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/3/30 16:54
 */
public class printMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(printMatrix(a));
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (tR <= dR && tC <= dC) {
            ArrayList<Integer> add = add(matrix, tR++, tC++, dR--, dC--, list);
            list = add;
        }
        return list;

    }

    public static ArrayList<Integer> add(int[][] m, int tR, int tC, int dR, int dC, ArrayList<Integer> list) {
        if (tR == dR) {
            for (int i = tC; i <= dC; i++) {
                list.add(m[tR][i]);
            }
        } else if (tC == dC) {
            for (int i = tR; i <= dR; i++) {
                list.add(m[i][tC]);
            }
        } else {
            int a = tR;
            int b = tC;
            while (b != dC) {
                list.add(m[tR][b++]);
            }
            while (a != dR) {
                list.add(m[a++][dC]);
            }
            while (b != tC) {
                list.add(m[dR][b--]);
            }
            while (a != tR) {
                list.add(m[a--][tC]);
            }
        }
        return list;
    }
}
