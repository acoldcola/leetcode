package 竞赛.第44场双周赛;


/**
 * @Author ZhangKe
 * @Date 2021/1/24 10:52
 * @Version 1.0
 */
public class add2 {
    public static void main(String[] args) {
        minCharacters("ace","abe");
    }
    public static int minCharacters(String a, String b) {
        int[] va = new int[26];
        int[] vb = new int[26];
        for (int i = 0; i < a.length(); i++) {
            va[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            vb[b.charAt(i) - 'a']++;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= 25; i++) {
            res = Math.min(res,a.length() + b.length() - va[i] - vb[i]);
        }
        for (int i = 0; i < 25; i++) {
            int x = 0;
            for (int j = i+1; j < 26; j++) {
                x += va[j];
            }
            for (int j = 0; j <= i; j++) {
                x += vb[j];
            }
            res = Math.min(res,x);
        }
        for (int i = 0; i < 25; i++) {
            int x = 0;
            for (int j = i+1; j < 26; j++) {
                x += vb[j];
            }
            for (int j = 0; j <= i; j++) {
                x += va[j];
            }
            res = Math.min(res,x);
        }
        return res;
    }
}
