/**
 * @auther ZhangKe
 * @date 2018/10/18 10:44
 */
public class leetcode657 {
    public static void main(String[] args) {
        System.out.print(judgeCircle("UD"));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') x--;
            if (moves.charAt(i) == 'R') x++;
            if (moves.charAt(i) == 'U') y++;
            if (moves.charAt(i) == 'D') y--;
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }
}
