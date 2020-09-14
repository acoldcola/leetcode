package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/13 10:59
 * @Version 1.0
 */
public class leetcode5512 {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int sum = 0;
        for (int i = 0; i < pairs.length; i++){
            if(preferences[pairs[i][0]][n-1] == pairs[i][1]){
                sum++;
            }
            if(preferences[pairs[i][1]][n-1] == pairs[i][0]){
                sum++;
            }
        }
        return sum;
    }
}
