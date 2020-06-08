package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/5 18:23
 * @Version 1.0
 * 统计作战单位数
 */
public class leetcode1395 {
    public int numTeams(int[] rating) {
        for (int i = 0; i < rating.length - 1; i++) {
            int max = 1;
            int mix = 1;
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[j] > rating[i]) {
                    max++;
                }else {
                    mix++;
                }
            }
        }
        return 0;
    }
}
