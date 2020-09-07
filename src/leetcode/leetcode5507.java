package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/6 10:37
 * @Version 1.0
 */
public class leetcode5507 {
    public static void main(String[] args) {
        leetcode5507 l =new leetcode5507();
        l.modifyString("??yw?ipkj?");
    }
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (sb.charAt(i) == '?'){
               char x  = 'a';
               if (i - 1 >= 0 && i + 1 < s.length()){
                   while (x <= 'z'){
                       if (x != sb.charAt(i -1) && x != sb.charAt(i + 1)){
                           break;
                       }else {
                           x = (char) (x + 1);
                       }
                   }
               }
               else if (i - 1 >= 0){
                   while (x <= 'z') {
                       if (x != sb.charAt(i - 1)) {
                           break;
                       } else {
                           x = (char) (x + 1);
                       }
                   }
                }
                else if (i + 1 < s.length()){
                   while (x <= 'z') {
                       if (x != sb.charAt(i + 1)) {
                           break;
                       } else {
                           x = (char) (x + 1);
                       }
                   }
                }
                sb.replace(i,i+1, String.valueOf(x));
            }
        }
        return sb.toString();
    }
}
