package 笔试;

public class test {
    int sum = 0;
    public int paintingPlan(int n, int k) {
        if (k > n*n || k < n || k % n != 0){
            return 0;
        }
        int a = k / n;
        if (a == n) {
            return 1;
        }
        dfs(a,n,0,0);
        return sum * 2;
    }

    private void dfs(int a, int n,int res,int cur) {
        if (a == res){
            sum++;
            return;
        }
        for (int i = cur; i < n; i++){
            res ++;
            dfs(a,n,res,i + 1);
            res --;
        }
    }
}
