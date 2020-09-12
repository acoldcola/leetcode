package 模板;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/9/12 15:06
 * @Version 1.0
 */
public class text2 {
    public static void main(String[] args) {
        text2 text2 = new text2();
        text2.breakfastNumber(new int[]{10,20,5},new int[]{5,5,2},15);
    }
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(drinks);
        int p = drinks.length - 1;
        int sum = 0;
        for (int i = 0; i < staple.length; i++){
            int c = x - staple[i];
            int l = 0;
            int r = p;
            while (l <= r){
                int mid = (l + r)/2;
                if (c < drinks[mid] ){
                    r = mid - 1;
                }else if (c >= drinks[mid] ){
                    l = mid + 1;
                }
            }
            sum += (r + 1);
            sum %= 1000000007;
        }
        return sum;
    }
}
