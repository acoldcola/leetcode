package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/9/2 16:34
 * 比特位计数
 */
public class leetcode338 {
    public static void main(String[] args){
        countBits(2);
    }

    public static int[] countBits(int num) {
        int[] a = new int[num + 1];
        for(int i = 0; i <= num; i++) {
            int count = 0;
            int j = i;
            while (j != 0) {
                j = j & (j - 1);
                count ++;
            }
            a[i] = count;
        }
        return a;
    }
}
