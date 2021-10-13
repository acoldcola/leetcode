package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/10/13 19:06
 * @Version 1.0
 *Fizz Buzz
 */
public class leetcode412 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            }else if (i % 3 == 0) {
                res.add("Fizz");
            }else if (i % 5 == 0) {
                res.add("Buzz");
            }else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
