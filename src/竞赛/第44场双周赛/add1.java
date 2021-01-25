package 竞赛.第44场双周赛;

/**
 * @Author ZhangKe
 * @Date 2021/1/24 10:33
 * @Version 1.0
 */
public class add1 {
    public static void main(String[] args) {
        maximumTime("?4:3?");
    }
    public static String maximumTime(String time) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < time.length();i++) {
            if (i == 0 && time.charAt(i) == '?') {
                if (!time.substring(i+1,i+2).equals("?") && Integer.valueOf(time.substring(i+1,i+2)) > 4) {
                    sb.append(1);
                }else {
                    sb.append(2);
                }
            }else if (i == 1 && time.charAt(i) == '?') {
                if (time.charAt(i - 1) == '1' || time.charAt(i - 1) == '0') {
                    sb.append(9);
                }else {
                    sb.append(3);
                }
            }else if (i == 3 && time.charAt(i) == '?') {
                sb.append(5);
            }else if (i == 4 && time.charAt(i) == '?') {
                sb.append(9);
            }else {
                sb.append(time.charAt(i));
            }
        }
        return sb.toString();
    }
}
