package 第86场双周赛;

/**
 * @Author ZhangKe
 * @Date 2022/9/3 22:29
 * @Version 1.0
 */
public class test3 {
    public static void main(String[] args) {
        test3 test = new test3();
        test.maximumRows(new int[][] {{0,0,0},{1,0,1},{0,1,1},{0,0,1}},2);
    }
    int res = 0;
    public int maximumRows(int[][] mat, int cols) {
        boolean[] used = new boolean[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            used[i] = true;
            dfs(i,used,mat,cols - 1);
            used[i] = false;
        }
        return res;
    }

    public int getMax(boolean[] used,int[][] mat) {
        int res = 0;
        for (int i = 0; i < mat.length;i++) {
            boolean flag = true;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && !used[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res++;
            }
        }
        return res;
    }
    private void dfs(int i, boolean[] used, int[][] mat, int cols) {
        if (cols == 0) {
           int max = getMax(used,mat);
           res = Math.max(res,max);
        }
        if (i < 0 || i > mat[0].length - 1) {
            return;
        }
        for (int j = i + 1; j < mat[0].length; j++) {
            if (!used[j]) {
                used[j] = true;
                dfs(j,used,mat,cols - 1);
                used[j] = false;
            }
        }
    }
}
