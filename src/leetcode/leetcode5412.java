package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/17 10:32
 * @Version 1.0
 */
public class leetcode5412 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] || queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }
}
