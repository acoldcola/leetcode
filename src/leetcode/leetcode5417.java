package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/24 10:33
 * @Version 1.0
 */
public class leetcode5417 {
    public static void main(String[] args) {
        leetcode5417 l = new leetcode5417();
        l.maxVowels("leetcode",3);
    }
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int max = 0;
        int j = 0;
        while (j < chars.length && j < k) {
            if (chars[j] == 'a' || chars[j] == 'e' || chars[j] == 'i' || chars[j] == 'o' || chars[j] == 'u') {
                max ++;
            }
            j++;
        }
        if (k < chars.length) {
            int x = 0;
            int sum = max;
            for (int i = k; i < chars.length; i++) {
                if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                    sum ++;
                }
                if(x <  chars.length && chars[x] == 'a' || chars[x] == 'e' || chars[x] == 'i' || chars[x] == 'o' || chars[x] == 'u') {
                    sum --;
                }
                x++;
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}
