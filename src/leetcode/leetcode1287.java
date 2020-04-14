package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/14 11:21
 * @Version 1.0
 * 有序数组中出现次数超过25%的元素
 */
public class leetcode1287 {
    public static void main(String[] args) {
        leetcode1287 l = new leetcode1287();
        int[] a = {1,1,2,2,3,3,3,3};
        l.findSpecialInteger(a);
    }
    public int findSpecialInteger(int[] arr) {
        int x = (arr.length+2)/4;
        for (int i = 0; i < arr.length-x; i++) {
            int sum = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sum++;
                }
                if (sum > x) {
                    return arr[i];
                }
            }
        }
        return arr[0];
    }
}
