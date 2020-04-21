package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 17:15
 * @Version 1.0
 * 寻找比目标字母大的最小字母
 */
public class leetcode744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0;i < letters.length; i++) {
            if (target < letters[i]){
                return letters[i];
            }
        }
        return letters[0];
    }
}
