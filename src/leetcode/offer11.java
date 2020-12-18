package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/16 17:15
 * @Version 1.0
 */
public class offer11 {
    public static void main(String[] args) {
        offer11 o = new offer11();
        o.minArray(new int[] {3,4,5,1,2});
    }

    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            }else if (numbers[mid] == numbers[right]) {
                right -= 1;
            } else{
                right = mid;
            }
        }
        return numbers[left];
    }
}