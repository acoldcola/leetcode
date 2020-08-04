package leetcode;

import com.sun.javafx.image.impl.IntArgb;

/**
 * @Author ZhangKe
 * @Date 2020/8/2 10:30
 * @Version 1.0
 */
public class leetcode5475 {
    public static void main(String[] args) {
        leetcode5475 leetcode5475 = new leetcode5475();
        leetcode5475.countGoodTriplets(new int[] {7,3,7,3,12,1,12,2,3},5,8,1);
    }
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cou = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for(int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        cou++;
                    }
                }
            }
        }
        return cou;
    }
}
