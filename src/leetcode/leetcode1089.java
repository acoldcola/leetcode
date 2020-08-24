package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/8/24 18:18
 * @Version 1.0
 * 复写零
 */
public class leetcode1089 {
    public static void main(String[] args) {
        leetcode1089 l = new leetcode1089();
        l.duplicateZeros(new int[] {1,0,2,3,0,4,5,0});
    }
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0){
                op(arr,i);
                i++;
            }
        }
    }
    public void op(int[] a,int x){
        int tem = a[x + 1];
        a[x + 1] = 0;
        for (int i = x+2; i < a.length; i++){
            int b = a[i];
            a[i] = tem;
            tem = b;
        }
    }
}
