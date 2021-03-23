package 模板;

/**
 * @Author ZhangKe
 * @Date 2021/3/22 22:47
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,5,9,2,3,7};
        quick(a,0,a.length - 1);
        System.out.println(a);
    }
    public static void quick(int[] a, int l, int r) {
        if (l < r) {
            int[] res = portion(a,l,r);
            quick(a,0,res[0] - 1);
            quick(a,res[1] + 1,r);
        }
    }
    public static int[] portion(int[] a, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (a[l] < a[r]) {
                swap(a,++less,l++);
            }else if (a[l] > a[r]) {
                swap(a,--more,l);
            }else {
                l++;
            }
        }
        swap(a,l,r);
        return new int[] {less+1,more};
    }

    public static void swap(int[] a, int i ,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
