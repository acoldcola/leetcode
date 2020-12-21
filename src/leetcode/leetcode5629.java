package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/20 10:32
 * @Version 1.0
 */
public class leetcode5629 {
    public static void main(String[] args) {
        leetcode5629 l = new leetcode5629();
        l.reformatNumber("9964-");
    }
    public String reformatNumber(String number) {
        number = number.replace(" ", "").replace("-","");
        int x = number.length() % 3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length() - 3 - x; i+=3) {
            sb.append(number.substring(i,i+3)+"-");
        }
        if (number.length() <= 3) {
            return number;
        }
        if (x == 0) {
            sb.append(number.substring(number.length() -3,number.length()));
        }else if (x == 1) {
            sb.append(number.substring(number.length() - 4,number.length() - 2) + "-");
            sb.append(number.substring(number.length()-2,number.length()));
        }else {
            sb.append(number.substring(number.length() - 5,number.length() - 2) + "-");
            sb.append(number.substring(number.length()-2,number.length()));
        }
        return sb.toString();
    }
}
