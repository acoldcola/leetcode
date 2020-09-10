package leetcode;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @Author ZhangKe
 * @Date 2020/9/9 16:35
 * @Version 1.0
 * 掷骰子的N种方法
 */
public class leetcode1155 {
    public static void main(String[] args) {
        leetcode1155 l = new leetcode1155();
        l.numRollsToTarget(2,6,7);
    }
    public int sum;
    public int numRollsToTarget(int d, int f, int target) {
        if (target > d * f){
            return 0;
        }
        dfs(target,f,d,0);
        return sum;
    }

    private void dfs(int target, int f,int d,int cou) {
        if(d == cou){
            if (target == 0){
                sum %= 10e9 + 7;
                sum++;
            }
            return;
        }
        for (int i = 1; i <= f;i++){
            if (target < 0){
                break;
            }
            cou ++;
            dfs(target - i,f,d,cou);
            cou --;
        }
    }
}
