package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/13 10:39
 * @Version 1.0
 */
public class leetcode5511 {
    public static void main(String[] args) {
        leetcode5511 l = new leetcode5511();
        l.numSpecial(new int[][]{{1,0,0},{0,0,1},{1,0,0}});
    }
    public int numSpecial(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (mat[i][j] == 1){
                    if (judge(i,j,mat)){
                        sum++;
                    }
                    break;
                }
            }
        }
        return sum;
    }
    public boolean judge(int i,int j,int[][] a){
        for (int x = 0; x < a.length ; x++){
            if (a[x][j] == 1 && x != i){
                return false;
            }
        }
        for (int y = 0; y < a[0].length ; y++){
            if (a[i][y] == 1 && y != j){
                return false;
            }
        }
        return true;
    }
}
