package 第309场周赛;

/**
 * @Author ZhangKe
 * @Date 2022/9/4 10:31
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        test2 test2 = new test2();
        test2.numberOfWays(1,2,7);
    }
    int res = 0;
    int mid = 0;
    public int numberOfWays(int startPos, int endPos, int k) {
        if ((k - startPos + endPos) % 2 != 0) {
            return 0;
        }
        mid = (k - (endPos - startPos)) << 1;
        dfs(startPos,endPos,k);
        return res;
    }

    private void dfs(int startPos, int endPos, int k) {
        if (startPos > k ) {
            return;
        }
        if (k == 0 && startPos == endPos) {
            res++;
            res = (int) (res % (10e9 + 7));
            return;
        }
        dfs(startPos + 1,endPos,k-1);
        dfs(startPos - 1,endPos,k-1);
    }
}
