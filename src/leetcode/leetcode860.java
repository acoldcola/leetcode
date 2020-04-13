package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/8 17:56
 * @Version 1.0
 * 柠檬水找零
 */
public class leetcode860 {
    public static void main(String[] args) {
        leetcode860 l = new leetcode860();
        int[] a = {5,5,5,10,20};
        l.lemonadeChange(a);
    }
    public boolean lemonadeChange(int[] bills) {
        int[] a = new int[2];
        boolean x = true;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                a[0] ++;
            }
            else if (bills[i] == 10) {
                if (a[0] < 1){
                    x = false;
                    break;
                }
                a[0] --;
                a[1] ++;
            }else if (bills[i] == 20) {
                if (a[1] >= 1 && a[0] >= 1) {
                    a[1] --;
                    a[0] --;
                }else if(a[0] >= 3) {
                    a[0] -= 3;
                }else {
                    x = false;
                    break;
                }
            }
        }
        return x;
    }
}
