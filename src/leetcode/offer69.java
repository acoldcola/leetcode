package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/10/14 20:18
 * @Version 1.0
 */
public class offer69 {
    public static void main(String[] args) {
        peakIndexInMountainArray(new int[] {3,5,3,2,0});
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left - (left - right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }else if (arr[mid] > arr[mid - 1]) {
                left = mid;
            }else {
                right = mid;
            }
        }
        return -1;
    }
}
