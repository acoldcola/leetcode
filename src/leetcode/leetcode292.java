package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/7/26 17:51
 * Nim 游戏
 */
public class leetcode292 {
    public boolean canWinNim(int n) {
        if(n % 4 == 0){
            return false;
        }
        return true;
    }
}
