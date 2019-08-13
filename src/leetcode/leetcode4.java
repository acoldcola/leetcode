package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/8/13 14:23
 * 寻找两个有序数组的中位数
 */
public class leetcode4 {
    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2, 4};
        System.out.println(findMedianSortedArrays(a, b));
}

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length + nums2.length];
        if (nums1 == null || nums2 == null) {
            a = nums1 == null ? nums1 : nums2;
        } else {
            int x = 0;
            int y = 0;
            int i = 0;
            while (x != nums1.length && y != nums2.length) {
                if (nums1[x] <= nums2[y]) {
                    a[i++] = nums1[x++];
                } else {
                    a[i++] = nums2[y++];
                }
            }
            if (x == nums1.length) {
                while (y != nums2.length) {
                    a[i++] = nums2[y++];
                }
            } else {
                while (x != nums1.length) {
                    a[i++] = nums1[x++];
                }
            }
        }
        if (a.length % 2 == 0) {
            return (a[a.length / 2 - 1] + a[a.length / 2] ) / 2d;
        } else {
            return a[a.length / 2];
        }
    }
}
