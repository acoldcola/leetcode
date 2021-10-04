package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/10/4 11:19
 * @Version 1.0
 */
public class leetcode482 {
    public static void main(String[] args) {
        leetcode482 l = new leetcode482();
        l.licenseKeyFormatting("a-a-a-a-",1);
    }
    public String licenseKeyFormatting(String s, int k) {
        String[] str = s.split("-");
        if (str == null || str.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length;i++) {
            stringBuilder.append(str[i]);
        }
        int num = stringBuilder.length();
        int res = num / k;
        int start = num % k;
        StringBuilder sb = new StringBuilder();
        if (start == 0) {
            start = k;
            res --;
        }
        sb.append(stringBuilder.substring(0,start));
        for (int i = 0; i < res; i++) {
            sb.append("-");
            int x = start + i * k;
            sb.append(stringBuilder.substring(x,x + k));
        }
        return sb.toString().toUpperCase();
    }
}
