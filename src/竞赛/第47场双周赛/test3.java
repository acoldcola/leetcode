package 竞赛.第47场双周赛;

/**
 * @Author ZhangKe
 * @Date 2021/3/6 22:27
 * @Version 1.0
 */
public class test3 {
    public static void main(String[] args) {
        beautySum("aabcb");
    }
    public static int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] a = new int[26];
            a[s.charAt(i) - 'a']++;
            for (int j = i+1; j < s.length(); j++) {
                a[s.charAt(j) - 'a'] ++;
                if (j - i >= 2) {
                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;
                    for (int k = 0; k < a.length; k++) {
                        if (a[k] >= max) {
                            max = a[k];
                        }
                        if (a[k] <= min && a[k] != 0) {
                            min = a[k];
                        }
                    }
                    sum += max - min;
                }
            }
        }
        return sum;
    }
}
