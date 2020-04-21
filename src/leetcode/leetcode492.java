package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 14:52
 * @Version 1.0
 */
public class leetcode492 {
    public int[] constructRectangle(int area) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        if (area == 1) {
            return new int[] {1,1};
        }
        for (int i= area - 1; i > 0; i++) {
            if (area % i == 0) {
                if (Math.abs((area / i) - i) < min) {
                    min = Math.abs((area / i) - i);
                    count = i;
                }
            }
        }
        int last = count > area/count ? count : area/count;
        return new int[] {last,area/last};
    }
}
