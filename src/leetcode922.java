public class leetcode922 {
    public static void main(String[] args) {
        int a[] = {4, 2, 5, 7};
        sortArrayByParityII(a);
        for (int a1 : a) {
            System.out.print(a1);
        }
    }

    public static int[] sortArrayByParityII(int[] A) {
        int a = A.length;
        // 存偶数的
        int m = 0;
        int[] b = new int[a];
        // 存奇数的
        int n = 0;
        int[] c = new int[a];
        for (int i = 0; i < a; i++) {
            if (A[i] % 2 == 0) {
                b[m++] = A[i];
            } else {
                c[n++] = A[i];
            }
        }
        m = 0;
        n = 0;
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                A[i] = b[m++];
            } else {
                A[i] = c[n++];
            }
        }
        return A;
    }
}
