/**
 * @auther ZhangKe
 * @date 2019/8/1 17:24
 * 反转字符串中的单词 III
 */
public class leetcode557 {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        char temp ;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            char[] chars = str[i].toCharArray();
            int x = chars.length - 1;
            for (int j = 0; j < chars.length/2; j++) {
                temp = chars[j];
                chars[j] = chars[x];
                chars[x--] = temp;
            }
            stringBuffer.append(String.valueOf(chars)).append(" ");
        }
        return stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
    }
}