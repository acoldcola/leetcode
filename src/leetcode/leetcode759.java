package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/11 10:40
 * @Version 1.0
 * 区间子数组个数
 */
public class leetcode759 {
    public static void main(String[] args) {
        numSubarrayBoundedMax(new int[]{409,649,313,499,676,516,106,446,491},542,722);
        }
    public static int numSubarrayBoundedMax(int[] A, int L, int R) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            int a = i-1;
            while (a >= 0 && A[a] < L && A[i] >= L && A[i] <= R) {
                int b = i+1;
                a--;
                sum++;
                while (b < A.length && A[b] <= R) {
                    b++;
                    sum++;
                }
            }
            int j = i;
            int max = A[j];
            System.out.println("数组：");
            while (j < A.length && max >= L && max <= R) {
                count ++;
                j++;
                if (j < A.length) {
                    max = Math.max(max,A[j]);
                }
            }
            count += sum;
        }
        System.out.println(count);
        return count;
    }
}
