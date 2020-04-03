package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/3 21:42
 * @Version 1.0
 * 加一
 */
public class leetcode66 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(plusOne(a));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
