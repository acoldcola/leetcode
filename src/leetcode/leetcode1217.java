package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/8 17:11
 * @Version 1.0
 * 玩筹码
 */
public class leetcode1217 {
    public int minCostToMoveChips(int[] chips) {
        int cardinalNumber = 0;
        int evenNumber = 0;
        for (int i = 0; i < chips.length; i++) {
            if (chips[i] % 2 == 0) {
                evenNumber ++;
            }else {
                cardinalNumber ++;
            }
        }
        return Math.min(evenNumber,cardinalNumber);
    }
}
