package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/1/3 10:34
 * @Version 1.0
 */
public class leetcode5641 {
    public static void main(String[] args) {
        maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}},10);
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(o1,o2) -> o2[1] - o1[1]);
        int sum = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (truckSize >= boxTypes[i][0]) {
                sum += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }else {
                sum += truckSize * boxTypes[i][1];
                break;
            }
        }
        return sum;
    }
}
