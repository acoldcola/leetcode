package 竞赛.LCCUP21;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/4/5 14:56
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        orchestraLayout(4,1,2);
    }
    public static int orchestraLayout(int num, int xPos, int yPos) {
        int[][] res = new int[num][num];
        int a = 0;
        int b = 0;
        int x = res.length - 1;
        int y = res[0].length - 1;
        int o = 0;
        int size = (x+1)*(y+1);
        int p = 1;
        for (int i = 0; i < (res.length + 1) / 2;i++) {
            if (i != 0) {
                a ++;
                b ++;
                x --;
                y --;
            }
            for (int i1 = b; i1 <= y && o < size; i1++) {
                if (p > num) {
                    p = 1;
                }
                res[a][i1] = p++;
                o++;
            }
            for (int i2 = a + 1; i2 <= x && o < size; i2++) {
                if (p > num) {
                    p = 1;
                }
                res[i2][y] = p++;
                o++;
            }
            for (int i3 = y - 1; i3 >= b && o < size;  i3--) {
                if (p > num) {
                    p = 1;
                }
                res[x][i3] = p++;
                o++;
            }
            for (int i4 = x - 1; i4 >= a + 1 && o < size;  i4--) {
                if (p > num) {
                    p = 1;
                }
                res[i4][b] = p++;
                o++;
            }
        }
        return res[xPos][yPos];
    }
}
