public class leetcode832 {

    public int[][] flipAndInvertImage(int[][] A) {
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            int m = A.length-1;
            for (int j = 0;j < A.length/2; j++) {
                temp = A[i][j];
                A[i][j] = A[i][m];
                A[i][m] = temp;
                m--;
            }
        }for (int i = 0; i < A.length; i++) {
            for (int j = 0;j < A.length; j++) {
                A[i][j] = A[i][j]^1;
            }
        }
        return A;
    }
}
