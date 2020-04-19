package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/19 23:26
 * @Version 1.0
 *  IP 地址无效化
 */
public class leetcode1108 {
    public static void main(String[] args) {
        defangIPaddr("1.1.1.1");
    }
    public static String defangIPaddr(String address) {
        String[] strings = address.split("\\.");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strings.length - 1;i++) {
            str =str.append(strings[i] + "[.]");
        }
        return str.append(strings[3]).toString();
    }
}
