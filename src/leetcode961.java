import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @auther ZhangKe
 * @date 2019/2/9 16:21
 */
public class leetcode961 {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if(!set.add(a))
                return a;
        }
        return 0;
    }
}
