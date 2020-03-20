package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/3/11 17:05
 * @Version 1.0
 */
public class leetcode881 {
    public int numRescueBoats(int[] people, int limit) {
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i];
        }
        if ( sum <= limit) {
            return 1;
        }else {
            return sum % limit ==0 ? sum/limit : sum/limit + 1;
        }
    }
}
