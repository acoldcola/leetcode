package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/8/26 17:59
 * @Version 1.0
 * 将字符串翻转到单调递增
 */
public class leetcode926 {
    public static void main(String[] args) {
        leetcode926 l = new leetcode926();
        l.minFlipsMonoIncr("0011000010");
    }
    public int minFlipsMonoIncr(String S) {
        // 第一次出现1的地方
        int start = -1;
        // 最后一次出现0的地方
        int end = -1;
        boolean flag = true;
        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) == '1' && flag) {
                start = i;
                flag = false;
            }
            if (S.charAt(i) == '0'){
                end = i;
            }
        }
        if (start == -1 || end == -1 || start > end){
            return 0;
        }
        String str = S.substring(start,end + 1);
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                a++;
            }
            if (str.charAt(i) == '0'){
                b++;
            }
        }
        return Math.min(a,b);
    }
}
